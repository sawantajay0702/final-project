import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { RouterOutlet } from '@angular/router';
import { Response } from '../HotelResponse';
import { HotelServicet } from './hotel.service';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,CommonModule,ReactiveFormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit{
  title = 'hms_ang';

  hotels:Response[]=[];

  city=new FormControl('',[])
  minRating=new FormControl('',[Validators.min(0),Validators.max(5)])
  maxRating=new FormControl('',[Validators.min(0),Validators.max(5)])

  searchFG=new FormGroup({
    city:this.city,
    minRating:this.minRating,
    maxRating:this.maxRating
  });


  constructor(private hotelservice:HotelServicet){}

  ngOnInit(): void {
     this.hotelservice.getHotels().subscribe((response)=>{
      this.hotels=response.response;
        console.log(response);

        console.log(this.hotels);
     })
  }

  filterHotels(){
    if(this.city.value){
      console.log(this.city.value);
     this.hotels= this.hotels.filter((hotel)=>{
         return hotel?.city==this.city.value;
      })
    } 
    if(this.minRating.value){
      console.log(this.city.value);
     this.hotels= this.hotels.filter((hotel)=>{
      let rating=Number(this.minRating.value);
         return hotel?.rating>=rating && hotel?.rating<=5;
      })
    } 

    if(this.maxRating.value){
      console.log(this.city.value);
     this.hotels= this.hotels.filter((hotel)=>{
      let rating=Number(this.maxRating.value);
         return hotel?.rating<=rating && hotel?.rating>=0;
      })
    } 
  }
}
