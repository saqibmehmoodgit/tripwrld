package com.airline.mapper;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

import com.airline.model.Airline;
import com.airline.model.Airport;
import com.airline.model.CustomerBooking;
import com.airline.model.Flights;

@Mapper(componentModel = "spring",uses = {DateMapper.class})
@DecoratedWith(ResponseMapperDecorater.class)
public interface ResponseMapper {

    ResponseDto beerToBeerDto(Airline beer);
    ResponseDto beerToBeerDtoWithInventory(Airline beer);
    Airline resposneDtoToAirline(ResponseDto beer);
    ResponseDto airportToAirPortDto(Airport beer);
 
    Flights  responseDtoToFlights(ResponseDto responseDto);
    CustomerBooking  responseDtoToCustomerBooking(ResponseDto responseDto);

}
