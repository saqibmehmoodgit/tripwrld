package com.airline.repository;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import javax.persistence.TypedQuery;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.airline.mapper.ResponseDto;
import com.airline.model.Airline;
import com.airline.model.Airport;
import com.airline.model.CustomerBooking;
import com.airline.model.Flights;
import com.airline.model.Users;



public interface FlightsRepository extends JpaRepository<Flights, Integer>
{

    	@Query("select f.totalSeats from Flights f where f.flightsId =:id")
        Integer getTotalSeats(@Param("id") Integer id);
    	
    	@Modifying
    	@Query("update Flights f set f.totalSeats = ( f.totalSeats - :reduce)  where f.flightsId = :id")
    	Integer updateSeatsReduce(@Param("reduce") Integer reduce, @Param("id") Integer id);



//    	public List<Flights> get(@Param("id") String registrationid);
    	@Query("SELECT  s " +
    	        "FROM Flights s " +
    	       
    	        "WHERE  CAST(s.date AS date) = CAST(:date AS date) ")
    	List<Flights> getByDate( @Param("date") Timestamp date);
    	
    	 
    	 @Query("Select  s.flightsId ,a.airlineName, d.airportName,to.airportName ,s.date "
    			 +" from Flights s " +
    			                 "inner join Airport d on s.fromAirPort=d.airportId " +
    			                 "inner join Airport to on s.toAirPort=to.airportId " +
    			                 " inner join Airline a on s.airlineId=a.airlineId " +
    			                 "WHERE  CAST(s.date AS date) = CAST(:date AS date) and " +
    			                 "s.toAirPort  = :toAirport     and s.fromAirPort = :fromAirport "
    			 )
    	 List<Object[]>  findByDateAndAirports(@Param("date") Timestamp date,@Param("toAirport") Integer toAirport,@Param("fromAirport") Integer fromAirport  );
}
