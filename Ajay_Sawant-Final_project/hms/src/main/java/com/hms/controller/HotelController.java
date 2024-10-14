package com.hms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hms.ResponseHandler.GlobalResponseHandler;
import com.hms.entity.Hotel;
import com.hms.service.HotelService;


@RestController
@RequestMapping("/api/v1/hotel")
@CrossOrigin
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	@PostMapping("/save")
	public ResponseEntity<Object> saveHotel(@RequestBody Hotel hotel){
		Hotel savedHotel = hotelService.saveHotel(hotel);
		return GlobalResponseHandler.generateResponse(savedHotel, HttpStatus.CREATED, "Created");
	}
	
	@GetMapping("/get")
	public ResponseEntity<Object> getAllHotel(){
		List<Hotel> allHotels = hotelService.getAllHotels();
		return GlobalResponseHandler.generateResponse(allHotels, HttpStatus.CREATED, "Created");
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Object> updateHotel(@RequestBody Hotel hotel,@PathVariable Long id){
		Hotel savedHotel = hotelService.updateHotel(hotel, id);
		return GlobalResponseHandler.generateResponse(savedHotel, HttpStatus.CREATED, "Created");
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Object> deleteHotel(@PathVariable Long id){
	String message=hotelService.deleteHotel(id);
		return GlobalResponseHandler.generateResponse(message, HttpStatus.CREATED, "Created");
	}
	
	
	
	

}
