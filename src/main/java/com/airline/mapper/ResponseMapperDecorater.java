package com.airline.mapper;

import org.springframework.beans.factory.annotation.Autowired;

import com.airline.model.Airline;
import com.airline.model.Airport;
import com.airline.model.CustomerBooking;
import com.airline.model.Flights;

public abstract class ResponseMapperDecorater  implements  ResponseMapper 
{
///ResponseDto
///	private BeerInventoryService beerInventoryService;
    private ResponseMapper mapper;

//    @Autowired
//    public void setBeerInventoryService(BeerInventoryService beerInventoryService) {
//        this.beerInventoryService = beerInventoryService;
//    }

    @Autowired
    public void setMapper(ResponseMapper mapper) {
        this.mapper = mapper;
    }
    @Override
	public ResponseDto beerToBeerDto(Airline beer)
    {
    	return mapper.beerToBeerDto(beer);
    }
    @Override
	public  ResponseDto beerToBeerDtoWithInventory(Airline beer)
    {
    	return mapper.beerToBeerDtoWithInventory(beer);
    }
    @Override
	public ResponseDto airportToAirPortDto(Airport beer)
    {
    	return mapper.airportToAirPortDto(beer);
    }
    
    @Override
    public Flights  responseDtoToFlights(ResponseDto responseDto)
    {
    	return mapper.responseDtoToFlights(responseDto);
    }
   
    @Override
    public CustomerBooking  responseDtoToCustomerBooking(ResponseDto responseDto)
    {
    	return mapper.responseDtoToCustomerBooking(responseDto);
    }
}
