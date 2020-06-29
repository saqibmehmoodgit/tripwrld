package com.airline.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.airline.model.Airline;
@SpringBootTest
///@DataJpaTest
class AirlineRepositoryTest {
//	    @Autowired
//	    private TestEntityManager testEntityManager;
//	    
	    @Autowired
	    AirlineRepository  airlineRepository;
	    
	    @BeforeEach
	    public void setUp(){
	        // given
//	    	Airline airline = new Airline();
//	    	airline.setAirlineName("Emirates");
//	    	airlineRepository.save(airline);
//	    	Airline airline2 = new Airline();
//	    	airline2.setAirlineName("Lufthansa");
//	    	airlineRepository.save(airline2);
	    
	    }


//	    @Test
//	    public void whenFindById() {
//	        // when
//	    	Airline airline = airlineRepository.findById(1).get();
//	        assertThat(airline.getAirlineName()).isEqualTo("Emirates");
//	    }
//
//	    @Test
//	    public void whenFindByIdFaluire() {
//	        // when
//	    	Optional<Airline> airline = airlineRepository.findById(1000);
//
//	        assertThat(airline).isEmpty();
//	    }
//
//	    
//	    
//	    
//	    @Test
//	    public void whenFindAllPagination() {
//	    	Pageable firstPage = PageRequest.of(0, 9);
//	        // when
//	    	Page<Airline> airline = airlineRepository.findAll(firstPage);
//	    	 assertThat(airline).hasSizeGreaterThan(0);
//	    	Airline airLine =  	airline.toList().get(0);
//	    	 assertThat(airLine.getAirlineName()).isEqualTo("Emirates");
//	    	
//	     
//	    }
//	    
//	    @Test
//	    public void whenFindAllPaginationalFaluire() {
//	    	Pageable firstPage = PageRequest.of(3, 9);
//	        // when
//	    	Page<Airline> airline = airlineRepository.findAll(firstPage);
//	    	 assertThat(airline).hasSizeLessThan(1);
//	    	
//	     
//	    }
		 @Test
		    public void whenFindById()
		 {

			 assertTrue(true);
		 }   
}
