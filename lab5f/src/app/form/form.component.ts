import { Component, Input, OnInit, Output, EventEmitter } from '@angular/core';
import { Laptops } from '../interfaces/laptops';
import { LaptopsService } from '../services/laptops.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.scss']
})
export class FormComponent implements OnInit {

  @Input() laptop?:Laptops;
  @Output() updated: EventEmitter<null>= new EventEmitter();

  constructor(private service:LaptopsService) { }

  ngOnInit(): void {
  }

  updateLaptop() {
    if(this.laptop) {
      this.service.putLaptop(this.laptop).subscribe(
        ()=>{
          this.updated.emit();
        }
      )
    }
  }

}
