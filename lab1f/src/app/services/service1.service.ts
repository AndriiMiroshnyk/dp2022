import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Laptops } from '../interfaces/laptops';

@Injectable({
  providedIn: 'root'
})
export class Service1Service {

  url:string="/lab1/Servlet1";
  constructor(private http:HttpClient) { }

  getLaptops():Observable<Laptops[]>{
    return this.http.get<Laptops[]>(this.url);
  }
}
