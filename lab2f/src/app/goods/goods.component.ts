import { Component, OnInit } from '@angular/core';
import { Laptops } from '../interfaces/laptops';
import { Service1Service } from '../services/service1.service';

@Component({
  selector: 'app-goods',
  templateUrl: './goods.component.html',
  styleUrls: ['./goods.component.scss']
})
export class GoodsComponent implements OnInit {

  LaptopsList:Laptops [] = [];
  isClicked: boolean = true;

  constructor(private service:Service1Service) { }

  ClickButton() {
    this.isClicked = !this.isClicked;
  }
  ngOnInit(): void {
    this.acquireLaptops();
  }

  acquireLaptops(){
    this.service.getLaptops().subscribe(
      (laptops) => {
        this.LaptopsList=laptops;
      }
    );
  }

  setLaptopsList = (list: Laptops[]): void => {
    this.LaptopsList = list;
  }

}