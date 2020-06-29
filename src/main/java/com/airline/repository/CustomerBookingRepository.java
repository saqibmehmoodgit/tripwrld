package com.airline.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airline.model.Airline;
import com.airline.model.Airport;
import com.airline.model.CustomerBooking;



public interface CustomerBookingRepository extends JpaRepository<CustomerBooking, Integer>{

}
