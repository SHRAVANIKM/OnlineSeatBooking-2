package com.OSB.Model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "seats")
public class Seat implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int locationId;
	private String locationName;
	private int seatAvailable;

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public int getSeatAvailable() {
		return seatAvailable;
	}

	public void setSeatAvailable(int seatAvailable) {
		this.seatAvailable = seatAvailable;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Seat [locationId=" + locationId + ", locationName=" + locationName + ", seatAvailable=" + seatAvailable
				+ "]";
	}

	public Seat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seat(int locationId, String locationName, int seatAvailable) {
		super();
		this.locationId = locationId;
		this.locationName = locationName;
		this.seatAvailable = seatAvailable;
	}

}
