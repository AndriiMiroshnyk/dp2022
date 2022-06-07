import { Component, OnInit } from '@angular/core';
import { Laptops } from '../interfaces/laptops';
import { LaptopsService } from '../services/laptops.service';

@Component({
  selector: 'app-goods',
  templateUrl: './goods.component.html',
  styleUrls: ['./goods.component.scss']
})
export class GoodsComponent implements OnInit {

  title:string="List of Laptops";
  LaptopsList:Laptops[] = [];
  selectedLaptop?:Laptops;

  constructor(private service:LaptopsService) { }

  ngOnInit(): void {
    this.updateLaptop();
  }

  updateLaptop(): void {
    this.service.getLaptops().subscribe(
      (laptops) => {
        this.LaptopsList = laptops._embedded.laptops;
      }
    );
  }

  addLaptop(laptop:Laptops) {
    this.service.postLaptop(laptop).subscribe(
      (laptop) => {
        this.updateLaptop();
      }
    )
  }

  deleteLaptop(laptop:Laptops) {
    this.service.deleteLaptop(laptop).subscribe(
      () => {
        this.updateLaptop();
      }
    )
  }

  onSelect(laptop:Laptops) {
    if (this.selectedLaptop && laptop._links.laptop.href == this.selectedLaptop._links.laptop.href) {
      this.selectedLaptop = undefined;
    }
    else {
      this.selectedLaptop=laptop;
    }
  }

}