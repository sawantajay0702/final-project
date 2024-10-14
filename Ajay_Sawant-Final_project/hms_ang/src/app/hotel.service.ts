import {  HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HotelResponse } from '../HotelResponse';

@Injectable({
  providedIn: 'root'
})
export class HotelServicet{

  baseUrl="/api/v1/hotel/get"
  constructor(private httpClient:HttpClient) { }

  getHotels(): Observable<HotelResponse> {
    return this.httpClient.get<HotelResponse>(this.baseUrl);
  }



}
