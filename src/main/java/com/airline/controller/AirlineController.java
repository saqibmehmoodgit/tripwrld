package com.airline.controller;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.airline.mapper.ResponseDto;
import com.airline.responselist.ResponseList;
import com.airline.service.AirlineServiceImpl;
import com.airline.service.AirportServiceImpl;
import com.airline.service.FlightsServiceImpl;

import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class AirlineController {

//	@Autowired
//    private  AirportServiceImpl airportServiceImpl;
//	@Autowired
//	private  BeerInventoryMapper beerInventoryMapper;
	
	@Autowired
	AirlineServiceImpl airlineServiceImpl;
	
    @GetMapping("/airline")
    ResponseList listBeersById(){
    	
    	
    return airlineServiceImpl.listBeers();
    	
//    	return airportServiceImpl.listBeers();

//        return beerInventoryRepository.findAllByBeerId(beerId)
//                .stream()
//                .map(beerInventoryMapper::beerInventoryToBeerInventoryDto)
//                .collect(Collectors.toList());
    }
    

//    @GetMapping("/airPorts")
//    ResponseList allAirPorts(){
//    	
//    	
//    	
//    	return airportServiceImpl.getAllAirPorts();
//
//    }
    
    
//    @GetMapping("/flight")
//    ResponseList listFetch(){
//    	
//    	
//    	
//    	
//    	return impl.conversion();
//
////        return beerInventoryRepository.findAllByBeerId(beerId)
////                .stream()
////                .map(beerInventoryMapper::beerInventoryToBeerInventoryDto)
////                .collect(Collectors.toList());
//    }
//    
   
}