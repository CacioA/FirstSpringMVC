package com.cacioa.spring;

import java.util.LinkedHashMap;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Car {

	private String carBrand;
	@NotNull(message="is required")
	@Size(min=3,message="is required")
	private String carModel;
	private String country;
	private String gearbox;
	
	private LinkedHashMap<String,String> countryOptions;
	
	public Car() {
			// populate country list
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR","Brazil");
		countryOptions.put("UK","United Kingdom");
		countryOptions.put("DE","Germany");
		countryOptions.put("FR","France");
		countryOptions.put("BEL","Belgium");
	}
	
	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getGearbox() {
		return gearbox;
	}

	public void setGearbox(String gearbox) {
		this.gearbox = gearbox;
	}
	
		
	
	
	
}
