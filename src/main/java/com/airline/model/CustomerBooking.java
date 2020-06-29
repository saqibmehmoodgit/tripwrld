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
@Table(name = "customer_booking")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CustomerBooking implements Serializable
{
	
	
	    
    @Id
    @Column(name = "custbook_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer custBookId;
    
	    @Column(name = "flight_id")
	    private Integer flightId;
	   
	    @Column(name = "user_id")
	    private Integer userId; 
	
	    @Column(name = "totalbooking")
	    private Integer totalSeats; 
	       
	
	    @Column(name = "reserve_date") 
	    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ssZ", shape=JsonFormat.Shape.STRING)
	    @CreationTimestamp
	    private Timestamp date;     


		public Integer getCustBookId() {
			return custBookId;
		}


		public void setCustBookId(Integer custBookId) {
			this.custBookId = custBookId;
		}


		public Integer getFlightId() {
			return flightId;
		}


		public void setFlightId(Integer flightId) {
			this.flightId = flightId;
		}


		public Integer getUserId() {
			return userId;
		}


		public void setUserId(Integer userId) {
			this.userId = userId;
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
			result = prime * result + ((custBookId == null) ? 0 : custBookId.hashCode());
			result = prime * result + ((date == null) ? 0 : date.hashCode());
			result = prime * result + ((flightId == null) ? 0 : flightId.hashCode());
			result = prime * result + ((totalSeats == null) ? 0 : totalSeats.hashCode());
			result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
			CustomerBooking other = (CustomerBooking) obj;
			if (custBookId == null) {
				if (other.custBookId != null)
					return false;
			} else if (!custBookId.equals(other.custBookId))
				return false;
			if (date == null) {
				if (other.date != null)
					return false;
			} else if (!date.equals(other.date))
				return false;
			if (flightId == null) {
				if (other.flightId != null)
					return false;
			} else if (!flightId.equals(other.flightId))
				return false;
			if (totalSeats == null) {
				if (other.totalSeats != null)
					return false;
			} else if (!totalSeats.equals(other.totalSeats))
				return false;
			if (userId == null) {
				if (other.userId != null)
					return false;
			} else if (!userId.equals(other.userId))
				return false;
			return true;
		}


		@Override
		public String toString() {
			return "CustomerBooking [custBookId=" + custBookId + ", flightId=" + flightId + ", userId=" + userId
					+ ", totalSeats=" + totalSeats + ", date=" + date + "]";
		}


	



	
//	    
//    @JsonIgnore
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "airline")
//    private Set<Airplane> airplanes;

	    
	    
	    
}

