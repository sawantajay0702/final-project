package com.hms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hms.entity.Hotel;
@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{

}
