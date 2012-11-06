package br.com.validator.model;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Car {
	
	@NotNull
	private String manufacturer;
	
	@NotNull
	@Size(min=2, max=10)
	private String licensePlate;

	@Min(2)
	private int seatCount;

	@AssertFalse
	private boolean isRegistered;
	
	public Car(String manufacturer, String licensePlate, int seatCount) {
		super();
		this.manufacturer = manufacturer;
		this.licensePlate = licensePlate;
		this.seatCount = seatCount;
	}

	public Car(String manufacturer, boolean isRegistered) {
		super();
		this.manufacturer = manufacturer;
		this.isRegistered = isRegistered;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public int getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}

	public boolean isRegistered() {
		return isRegistered;
	}

	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}
	
}