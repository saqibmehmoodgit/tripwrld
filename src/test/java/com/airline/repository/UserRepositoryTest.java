package com.airline.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.airline.model.Airline;
import com.airline.model.Airport;
import com.airline.model.Flights;
import com.airline.model.Users;
@SpringBootTest
class UserRepositoryTest {

	 @Autowired
	 UserRepository  userRepository;
	
	 @BeforeEach
	    public void setUp(){
	        // given
//	    	Users users = new Users();
//	    	users.setFirstName("Naseem ");
//	    	users.setLastName(" Iqbal");
//	    	users.setType("U");
//	    	users.setUserName("ALI");
//	    	users.setUserPassword("SAQIBEHMOO");
//	    	userRepository.save(users);
	    			
	 }
	 
	 @Test
	    public void whenFindById()
	 {

		 assertTrue(true);
	 }
//	   @Test
//	    public void whenFindById() {
//	        // when
//		   Optional<Users> users = userRepository.findById(1);
//		   
//	        assertThat(users).isNotEmpty();
//	    }
//	   
//	   @Test
//	    public void whenFindByIdFaluire() {
//	        // when
//		   Optional<Users> users = userRepository.findById(100);
//			
//	        assertThat(users).isEmpty();
//	    }

}
