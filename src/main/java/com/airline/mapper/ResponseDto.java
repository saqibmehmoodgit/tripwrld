package com.airline.mapper;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;

import javax.persistence.Column;
import com.fasterxml.jackson.annotation.JsonInclude;
/**
 * Created by jt on 2019-05-31.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDto {
	  private Integer airlineId;
	  private Integer airportId; 
	  private Integer flightsId;  
	  private Integer fromAirPort;
	  private Integer toAirPort;
	  private Integer userId;
	  private Integer totalSeats;
	  private String airlineName;
	  private String airportName;
	  private String airportNameTo;
	  private String date;  
	  
//	  private String userName;
//	  private String userPassword;
//	  private String firstName;
//	  
//    private UUID id;
//    private OffsetDateTime createdDate;
//    private OffsetDateTime lastModifiedDate;
//    private UUID beerId;
//    private Integer quantityOnHand;
}