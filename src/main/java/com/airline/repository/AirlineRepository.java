package com.airline.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airline.model.Airline;



public interface AirlineRepository extends JpaRepository<Airline, Integer>{

}
