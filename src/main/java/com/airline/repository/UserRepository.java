package com.airline.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airline.model.Airline;
import com.airline.model.Airport;
import com.airline.model.CustomerBooking;
import com.airline.model.Flights;
import com.airline.model.Users;



public interface UserRepository extends JpaRepository<Users, Integer>{
	Boolean existsByUserName(String username);
	Optional<Users> findByUserName(String username);
	///Boolean existsByEmail(String email);
}
