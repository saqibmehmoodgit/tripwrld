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
public class FlightsServiceImpl 
{
	@Autowired
	com.airline.repository.AirlineRepository airlineRepository;
	 @Autowired
	 FlightsRepository flightsRepository;
	
	 @Autowired
	 AirportRepository  airportRepository;
	 
	@Autowired
	ResponseMapper responseMapper;

	
	public void saveFlights(ResponseDto responseDto) 
	 {
 System.out.println( "  this is saveFlights of service impl ");
 ////responseDto.setDepartureDate(responseDto.getDepartureDate()+":14");
        Flights flights = responseMapper.responseDtoToFlights(responseDto);
        flightsRepository.save(flights);
	
	 }	
	public ResponseList listBeers() 
	 {
		ResponseDto res = new ResponseDto( 1 , 1,1,1,1,1,1,"PIA","DXB","","2007-11-11 12:13:14"
		  );
		Airline airline12 =	responseMapper.resposneDtoToAirline(res);
		
		//System.out.println(" here is dto work " + airline12.getDepartureDate() );
		
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

	public ResponseList findByDateAndAirports() 
	 {
	 	Airline airline = new Airline();
    	airline.setAirlineName("Emirates");
    	airlineRepository.save(airline);

	 	Airline airline2 = new Airline();
    	airline2.setAirlineName("PIA");
    	airlineRepository.save(airline2);
    	
    	Airport airPort = new Airport();
    	airPort.setAirportName("DXB");
    	airportRepository.save(airPort);
    	Airport airPort2 = new Airport();
    	airPort2.setAirportName("Heathrow");
    	airportRepository.save(airPort2);
    	
    	  LocalDateTime now = LocalDateTime.now();
    	//  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    	  
    	  
    	  DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
    	//  System.out.println("Post-Truncate: " + );
          Timestamp timestamp = Timestamp.valueOf(now);
    	Flights flights = new Flights();
    	flights.setAirlineId(airline.getAirlineId());
    	flights.setFromAirPort(airPort.getAirportId());
    	flights.setToAirPort(airPort2.getAirportId());
    	flights.setTotalSeats(10);
    	flights.setDate(timestamp);
    	
    	flightsRepository.save(flights);
    	
    	Flights flights1 = new Flights();
    	flights1.setAirlineId(airline2.getAirlineId());
    	flights1.setFromAirPort(airPort.getAirportId());
    	flights1.setToAirPort(airPort2.getAirportId());
    	flights1.setTotalSeats(20);
    	flights1.setDate(timestamp);
    	
    	flightsRepository.save(flights1);
    	
    	
    	Function<Object[], ResponseDto> func = x -> 
    	{
    		 
       return	new ResponseDto(null,null,(Integer)x[0] ,null,null,null,1,
    		   (String) x[1],(String) x[2], (String) x[3] , x[4].toString());
    	};
    	
    	
    	List<Object[]>  dtos = flightsRepository.findByDateAndAirports(timestamp,flights1.getToAirPort(),flights1.getFromAirPort());
    	Object[] s = dtos.get(0);
    	System.out.println(s[0] + " dots size is here  " +s[1]);
		
    	List<ResponseDto> result =	dtos.stream().map(func). collect(Collectors.toList());
    	   ResponseList beerPagedList;
           beerPagedList = new ResponseList(result,1,1,3L);
     
    	return	beerPagedList;

	 }


}
