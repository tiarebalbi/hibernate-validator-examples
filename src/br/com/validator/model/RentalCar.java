package br.com.validator.model;

import javax.validation.constraints.NotNull;

public class RentalCar extends Car {

	@NotNull
	private String rentalStation;
	
	public RentalCar(String manufacturer, boolean isRegistered) {
		super(manufacturer, isRegistered);
	}

	public String getRentalStation() {
		return rentalStation;
	}

	public void setRentalStation(String rentalStation) {
		this.rentalStation = rentalStation;
	}
	
}
