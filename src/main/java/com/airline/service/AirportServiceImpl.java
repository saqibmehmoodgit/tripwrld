package com.airline.service;

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
import com.airline.responselist.ResponseList;


@Service
public class AirportServiceImpl 
{
	@Autowired
	com.airline.repository.AirportRepository airportRepository;
	
	@Autowired
	ResponseMapper responseMapper;
	public ResponseList getAllAirPorts() 
	 {

//		ResponseDto res = new ResponseDto( 1 , null,"PIA","DXB","2007-11-11 12:13:14"
//		  );
//		Airline airline12 =	responseMapper.resposneDtoToAirline(res);
//		
//		System.out.println(" here is dto work " + airline12.getDepartureDate() );
//		
		Airport airPort = new Airport();
    	airPort.setAirportName("DXB");
    	airportRepository.save(airPort);
    	Airport airPort2 = new Airport();
    	airPort2.setAirportName("Heathrow");
    	airportRepository.save(airPort2);
		 ResponseList beerPagedList;
         Page<Airport> beerPage;
     	Pageable firstPage = PageRequest.of(0, 9);
    
        //search both
        beerPage = airportRepository.findAll(firstPage);
        
        		//beerRepository.findAllByBeerNameAndBeerStyle(beerName, beerStyle, pageRequest);
      

        beerPagedList = new ResponseList(beerPage
                .getContent()
                .stream()
                .map(responseMapper::airportToAirPortDto)
                .collect(Collectors.toList()),
                PageRequest
                        .of(beerPage.getPageable().getPageNumber(),
                                beerPage.getPageable().getPageSize()),
                beerPage.getTotalElements());
  

    return beerPagedList;
}



}
