import { Component, Input, OnInit } from '@angular/core';
import { FormControl, FormGroup} from '@angular/forms';
import { Laptops } from '../interfaces/laptops';
import { Service1Service } from '../services/service1.service';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.scss']
})
export class FormComponent implements OnInit {

  laptopForm = new FormGroup({
    title: new FormControl(''),
    img: new FormControl(''),
    description: new FormControl(''),
  });

  @Input() setLaptopsList!: (args: Laptops[]) => void;

  constructor(private service:Service1Service) { }

  ngOnInit(): void {
  }

  updateLaptops() {
    this.service.putLaptop(this.laptopForm.value).subscribe((laptops) => {
      this.setLaptopsList(laptops as Laptops[]);
    });
  }

}
