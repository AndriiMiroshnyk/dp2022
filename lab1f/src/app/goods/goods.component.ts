import { Component, OnInit } from '@angular/core';
import { Laptops } from '../interfaces/laptops';
import { Service1Service } from '../services/service1.service';

@Component({
  selector: 'app-goods',
  templateUrl: './goods.component.html',
  styleUrls: ['./goods.component.scss']
})
export class GoodsComponent implements OnInit {

  LaptopsList:Laptops [] = [] ;
  constructor(private service:Service1Service) { }

  isClicked1: boolean = true;
  isClicked2: boolean = true;
  isClicked3: boolean = true;
  ClickButton1() {
    this.isClicked1 = !this.isClicked1;
  }
  ClickButton2() {
    this.isClicked2 = !this.isClicked2;
  }
  ClickButton3() {
    this.isClicked3 = !this.isClicked3;
  }
  ngOnInit(): void {
    this.service.getLaptops().subscribe(
      (laptops) => {
        this.LaptopsList=laptops;
      }
    )
  }

}
