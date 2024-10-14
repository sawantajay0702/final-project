package com.hms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.entity.Hotel;
import com.hms.exceptions.EntitySaveException;
import com.hms.exceptions.GeneratException;
import com.hms.repository.HotelRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class HotelService {
	
	@Autowired
	private HotelRepository hotelRepository;

	
	public Hotel saveHotel(Hotel hotel) {
		try {
			return hotelRepository.save(hotel);
		} catch (Exception e) {
			throw new EntitySaveException(e.getMessage());
		}
	}
	
	public List<Hotel> getAllHotels() {
		try {
			return hotelRepository.findAll();
		} catch (Exception e) {
			throw new GeneratException(e.getMessage());
		}
	}
	
	public Hotel updateHotel(Hotel hotel,Long id) {
		Optional<Hotel> findById = hotelRepository.findById(id);
		if(findById.isPresent()) {
			Hotel exeHotel= findById.get();
			exeHotel.setGym(hotel.getGym());
			exeHotel.setName(hotel.getName());
			exeHotel.setCity(hotel.getName());
			exeHotel.setDescription(hotel.getDescription());
			exeHotel.setEmail(hotel.getEmail());
			exeHotel.setPool(hotel.getPool());
			return hotelRepository.save(exeHotel);
		}else {
			throw new EntityNotFoundException("Entity not Found");
		}
		
		
	}
	
	public String deleteHotel(Long id) {
		Optional<Hotel> findById = hotelRepository.findById(id);
		if(findById.isPresent()) {
			
			 hotelRepository.deleteById(id);
			 return "deleted";
		}else {
			throw new EntityNotFoundException("Entity not Found");
		}
	}
	
	
}
