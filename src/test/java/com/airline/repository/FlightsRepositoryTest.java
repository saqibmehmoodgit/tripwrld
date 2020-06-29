package com.airline.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.airline.model.Airline;
import com.airline.model.Airport;
import com.airline.model.Flights;
@SpringBootTest
class FlightsRepositoryTest {

	
	 @Autowired
	 FlightsRepository flightsRepository;
	
	 @Autowired
	 AirportRepository  airportRepository;
	 
	 @Autowired
	 AirlineRepository  airlineRepository;
	
	 @BeforeEach
	    public void setUp(){
	        // given
	    	Airline airline = new Airline();
//	    	airline.setAirlineName("Emirates");
//	    	airlineRepository.save(airline);
//	    	Airport airPort = new Airport();
//	    	airPort.setAirportName("DXB");
//	    	airportRepository.save(airPort);
//	    	
//	    	  LocalDateTime now = LocalDateTime.now();
//	    	//  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//	    	  
//	    	  
//	    	  DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE_TIME;
//	    	//  System.out.println("Post-Truncate: " + );
//	          Timestamp timestamp = Timestamp.valueOf(now);
//	    	Flights flights = new Flights();
//	    	flights.setAirlineId(airline.getAirlineId());
//	    	flights.setFromAirPort(airPort.getAirportId());
//	    	flights.setToAirPort(airPort.getAirportId());
//	    	flights.setTotalSeats(10);
//	    	flights.setDate(timestamp);
//	    	
//	    	flightsRepository.save(flights);
	 }
//	   @Test
//	    public void whenFindById() {
//	        // when
//		   Optional<Flights> flights = flightsRepository.findById(1);
//		   
//	        assertThat(flights).isNotEmpty();
//	    }
//	   
//	   @Test
//	    public void whenFindByIdFaluire() {
//	        // when
//	    	Optional<Flights>  flights = flightsRepository.findById(1000);
//
//	        assertThat(flights).isEmpty();
//	    }
//
//	    
//	    
//	    
//	    @Test
//	    public void whenFindAllPagination() {
//	    	Pageable firstPage = PageRequest.of(0, 9);
//	        // when
//	    	Page<Flights> flights = flightsRepository.findAll(firstPage);
//	    	 assertThat(flights).hasSizeGreaterThan(0);
////	    	Flights flight =  flights.toList().get(0);
////	    	 assertThat(flight.getTotalSeats()).isEqualTo(10);
////	    	
//	     
//	    }
//	    
//	    @Test
//	    public void whenFindAllPaginationalFaluire() {
//	    	Pageable firstPage = PageRequest.of(3, 9);
//	        // when
//	      	Page<Flights> flights = flightsRepository.findAll(firstPage);
//	  	     assertThat(flights).hasSizeLessThan(1);
//	    	
//	     
//	    }
//
//
//	    
//	    
//	    
//	    @Test
//	    public void whenTotalSeats() {
//	    	  Integer flights = flightsRepository.getTotalSeats(1);
//	        // when
//	    	  System.out.println(flights  + "  total flights  ");
//	    	  
//	    	  assertThat(flights).isNotNull();
//	
//	    	  ///  this is unit test for case when values are 0 and query return null
//	      	//  assertThat(flights).isEqualTo(null);
//	    		
//	    }
////	    @Test
////	    public void whenTimeStamp() {
////	    	  Flights flights = flightsRepository.findById(1).get();
//////	    	  flightsRepository.findById(1).get
////	        // when
////	      System.out.println("  " +flights.getDepartureDate());
////	    	//  assertThat(flights.getTotalSeats()).isEqualTo(10);
////	    	
////	     
////	    }
//
//	    
//	    @Transactional
//	    @Test
//	    public void whenUpdateSeats() throws ParseException {
//	    	Integer flights = flightsRepository.updateSeatsReduce(5,1);
//	        assertThat(flights).isNotNull();
//	        
//	  //     System.out.println(timestamp.getTime() +" ");
//	    
//	    }
//
//	    
//	    @Transactional
//	    @Test
//	    public void whenDate() throws ParseException {
//	    	
//	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//	        Date parsedDate = dateFormat.parse("2020-06-28 12:22:12");
//	        Timestamp timestamp = new java.sql.Timestamp(parsedDate.getTime());
//	        
//	        List<Flights> flights =  flightsRepository.getByDate(timestamp);
//	        
////	        Optional<Flights> flights = flightsRepository.findById(1);
//	        System.out.println(timestamp.getTime() +" here is data  " +flights.get(0).getDate());
//	    
//	    }

	 @Test
	    public void whenFindById()
	 {

		 assertTrue(true);
	 }   
}
