package com.kayiranga.restws.model;




import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Driver {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int driver_id;
	private String driver_name;

	/*@OneToMany(mappedBy="driver",cascade=CascadeType.ALL)*/
	/*@OneToMany(targetEntity = Trip.class, mappedBy = "driver", orphanRemoval = false, fetch = FetchType.EAGER)
	private Set<Trip> trip=new HashSet<Trip>();
	
	

	public Set<Trip> getTrip() {
		return trip;
	}

	public void setTrip(Set<Trip> trip) {
		this.trip = trip
	};*/

	public int getDriver_id() {
		return driver_id;
	}

	public void setDriver_id(int driver_id) {
		this.driver_id = driver_id;
	}

	public String getDriver_name() {
		return driver_name;
	}

	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
		
		
	}

}
