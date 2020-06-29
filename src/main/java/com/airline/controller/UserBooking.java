package com.airline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.airline.mapper.ResponseDto;
import com.airline.responselist.ResponseList;
import com.airline.service.CustomerBookingServiceImpl;
import com.airline.service.FlightsServiceImpl;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserBooking 
{
	@Autowired
	FlightsServiceImpl impl;
	@Autowired
	CustomerBookingServiceImpl customerBookingServiceImpl;
	
	  @PostMapping("/saveBooking")  
	    public boolean saveStudent(@RequestBody ResponseDto responseDto) { 
	    	System.out.println(responseDto.getFlightsId() + " " + 
	    			"  save bookings controller ,, user booking controller  "+responseDto.getDate() + " " 
	    			+responseDto.getTotalSeats());
	    	customerBookingServiceImpl.saveCustommerBooking(responseDto);
	    	return true;  
	          
	    } 
//	  @GetMapping("/findByDateAirports")  
//	    public ResponseList findByDateAndAirports() { 
//		  
//	    	
//	    	return impl.findByDateAndAirports();
//	          
//	    } 
//	  
	  
	  
}
