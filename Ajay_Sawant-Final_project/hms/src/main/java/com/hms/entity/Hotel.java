package com.hms.entity;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Table;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="hotels")
public class Hotel {

//	name, roomPrice, imageUrl, description, rating, city, email,
//	wifi (yes/no), gym (yes/no), pool (yes/no)
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name",nullable = false)
	private String name;
	
	@Column(name="imageUrl",nullable = false,length = Integer.MAX_VALUE)
	private String imageUrl;
	
	@Column(name="roomPrice",nullable = false)
	private Long roomPrice;
	
	@Column(name="description",nullable = false)
	private String description;
	
	@Column(name="rating",nullable = false)
	private Double rating;
	
	@Column(name="city",nullable = false)
	private String city;
	
	@Column(name="email",nullable = false,unique = true)
	private String email;
	
	@Column(name="wifi")
	private Boolean wifi;
	
	@Column(name="gym")
	private Boolean gym;
	
	@Column(name="pool")
	private Boolean pool;
	
	@Column(name="created_at")
	@CreationTimestamp
	private Timestamp createdAt;
	
	@Column(name="updated_at")
	@UpdateTimestamp
	private Timestamp updatedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getRoomPrice() {
		return roomPrice;
	}

	public void setRoomPrice(Long roomPrice) {
		this.roomPrice = roomPrice;
	}

	public String getDescription() {
		return description;
	}
	
	

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Boolean getWifi() {
		return wifi;
	}

	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}

	public Boolean getGym() {
		return gym;
	}

	public void setGym(Boolean gym) {
		this.gym = gym;
	}

	public Boolean getPool() {
		return pool;
	}

	public void setPool(Boolean pool) {
		this.pool = pool;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}



	public Hotel(Long id, String name, String imageUrl, Long roomPrice, String description, Double rating, String city,
			String email, Boolean wifi, Boolean gym, Boolean pool, Timestamp createdAt, Timestamp updatedAt) {
		super();
		this.id = id;
		this.name = name;
		this.imageUrl = imageUrl;
		this.roomPrice = roomPrice;
		this.description = description;
		this.rating = rating;
		this.city = city;
		this.email = email;
		this.wifi = wifi;
		this.gym = gym;
		this.pool = pool;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", name=" + name + ", roomPrice=" + roomPrice + ", description=" + description
				+ ", rating=" + rating + ", city=" + city + ", email=" + email + ", wifi=" + wifi + ", gym=" + gym
				+ ", pool=" + pool + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
	
	
	
	
	
}
