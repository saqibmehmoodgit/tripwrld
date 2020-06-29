package com.airline.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Set;
@Entity
@Table(name = "flights")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Flights implements Serializable
{
	
	      
    @Id
    @Column(name = "flight_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flightsId;
    
    @Column(name = "airline_id") 
	private Integer airlineId;
   @Column(name = "from_airport") 
	private Integer fromAirPort;
    
	  @Column(name = "to_airport") 
	private Integer toAirPort; 
    @Column(name = "totalseats") 
	private Integer totalSeats;
	
    @Column(name = "departure_date") 
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ssZ", shape=JsonFormat.Shape.STRING)
   /// @CreationTimestamp
    private Timestamp date;

	public Integer getFlightsId() {
		return flightsId;
	}

	public void setFlightsId(Integer flightsId) {
		this.flightsId = flightsId;
	}

	public Integer getAirlineId() {
		return airlineId;
	}

	public void setAirlineId(Integer airlineId) {
		this.airlineId = airlineId;
	}

	public Integer getFromAirPort() {
		return fromAirPort;
	}

	public void setFromAirPort(Integer fromAirPort) {
		this.fromAirPort = fromAirPort;
	}

	public Integer getToAirPort() {
		return toAirPort;
	}

	public void setToAirPort(Integer toAirPort) {
		this.toAirPort = toAirPort;
	}

	public Integer getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(Integer totalSeats) {
		this.totalSeats = totalSeats;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlineId == null) ? 0 : airlineId.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((flightsId == null) ? 0 : flightsId.hashCode());
		result = prime * result + ((fromAirPort == null) ? 0 : fromAirPort.hashCode());
		result = prime * result + ((toAirPort == null) ? 0 : toAirPort.hashCode());
		result = prime * result + ((totalSeats == null) ? 0 : totalSeats.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flights other = (Flights) obj;
		if (airlineId == null) {
			if (other.airlineId != null)
				return false;
		} else if (!airlineId.equals(other.airlineId))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (flightsId == null) {
			if (other.flightsId != null)
				return false;
		} else if (!flightsId.equals(other.flightsId))
			return false;
		if (fromAirPort == null) {
			if (other.fromAirPort != null)
				return false;
		} else if (!fromAirPort.equals(other.fromAirPort))
			return false;
		if (toAirPort == null) {
			if (other.toAirPort != null)
				return false;
		} else if (!toAirPort.equals(other.toAirPort))
			return false;
		if (totalSeats == null) {
			if (other.totalSeats != null)
				return false;
		} else if (!totalSeats.equals(other.totalSeats))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Flights [flightsId=" + flightsId + ", airlineId=" + airlineId + ", fromAirPort=" + fromAirPort
				+ ", toAirPort=" + toAirPort + ", totalSeats=" + totalSeats + ", date=" + date + "]";
	}

	    
//     @JsonIgnore
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "airline")
//    private Set<Airplane> airplanes;






}
