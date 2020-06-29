package com.airline.controller;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.CrossOrigin;
import com.airline.responselist.ResponseList;
import com.airline.service.AirlineServiceImpl;
import com.airline.service.AirportServiceImpl;
import com.airline.service.FlightsServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AirportController {

	@Autowired
    private  AirportServiceImpl airportServiceImpl;


    @GetMapping("/airPorts")
    ResponseList allAirPorts(){
    	
    	
    	
    	return airportServiceImpl.getAllAirPorts();

    }
    
    
   
}