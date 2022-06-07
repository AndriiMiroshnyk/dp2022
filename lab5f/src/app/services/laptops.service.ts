import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { BehaviorSubject, Observable } from 'rxjs';
import { Laptops } from '../interfaces/laptops';
import { Response } from '../interfaces/response';

@Injectable({
  providedIn: 'root'
})
export class LaptopsService {

  list = new BehaviorSubject<Laptops[]>([]);
  url: string = "http://localhost:1155/laptops";

  constructor(private http: HttpClient) { }

  getLaptops(): Observable<Response> {
    return this.http.get<Response>(this.url);
  }

  postLaptop(laptop:Laptops): Observable<Laptops[]> {
    return this.http.post<Laptops[]>(this.url,laptop);
  }

  putLaptop(laptop:Laptops): Observable<Laptops[]> {
    return this.http.put<Laptops[]>(laptop._links.laptop.href,laptop);
  }

  deleteLaptop(laptop:Laptops): Observable<Laptops[]> {
    return this.http.delete<Laptops[]>(laptop._links.laptop.href);
  }

  setList(list:Laptops[]) {
    this.list.next(list);
  }
}
