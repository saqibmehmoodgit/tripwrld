package com.airline.service;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.airline.mapper.ResponseDto;
import com.airline.mapper.ResponseMapper;
import com.airline.model.Airline;
import com.airline.model.Airport;
import com.airline.model.Flights;
import com.airline.repository.AirportRepository;
import com.airline.repository.FlightsRepository;
import com.airline.responselist.ResponseList;


@Service
public class AirlineServiceImpl 
{
	@Autowired
	com.airline.repository.AirlineRepository airlineRepository;
	@Autowired
	ResponseMapper responseMapper;
	public ResponseList listBeers() 
	 {

		
		
		
		Airline airline = new Airline();
		airline.setAirlineName("PIA");
		airlineRepository.save(airline);
		Airline airline2 = new Airline();
		airline2.setAirlineName("Emirates");
		airlineRepository.save(airline2);   
		 ResponseList beerPagedList;
        Page<Airline> beerPage;
    	Pageable firstPage = PageRequest.of(0, 9);
   
       //search both
       beerPage = airlineRepository.findAll(firstPage);
       
       		//beerRepository.findAllByBeerNameAndBeerStyle(beerName, beerStyle, pageRequest);
     

       beerPagedList = new ResponseList(beerPage
               .getContent()
               .stream()
               .map(responseMapper::beerToBeerDto)
               .collect(Collectors.toList()),
               PageRequest
                       .of(beerPage.getPageable().getPageNumber(),
                               beerPage.getPageable().getPageSize()),
               beerPage.getTotalElements());
 

   return beerPagedList;
}
	
}
