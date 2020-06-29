package com.airline.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airline.model.Airport;



public interface AirportRepository extends JpaRepository<Airport, Integer>{

}
