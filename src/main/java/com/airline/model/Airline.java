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
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.Set;
@Entity
@Table(name = "airline")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Airline implements Serializable
{

    @Id
    @Column(name = "airline_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer airlineId;
    @Column(name = "airlinet_name")
    private String airlineName;
//    @Column(name = "departure_date")
//    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ssZ", shape=JsonFormat.Shape.STRING)
//   /// @CreationTimestamp
//    private Timestamp departureDate;
    public Integer getAirlineId() {
        return airlineId;
    }

    public void setAirlineId(Integer airlineId) {
        this.airlineId = airlineId;
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        this.airlineName = airlineName;
    }

//      public Timestamp getDepartureDate() {
//		return departureDate;
//	}
//
//	public void setDepartureDate(Timestamp departureDate) {
//		this.departureDate = departureDate;
//	}

	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Airline)) return false;
        Airline airline = (Airline) o;
        return Objects.equals(getAirlineId(), airline.getAirlineId()) &&
                Objects.equals(getAirlineName(), airline.getAirlineName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAirlineId(), getAirlineName());
    }

    @Override
    public String toString() {
        return "Airline{" +
                "airlineId=" + airlineId +
                ", airlineName='" + airlineName + '\'' +
                
                '}';
    }
}

