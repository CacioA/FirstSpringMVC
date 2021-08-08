package com.cacioa.spring;

import java.util.LinkedHashMap;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Value;


public class Car {

	
	@NotNull(message="can't be empty")
	@Min(value=1900,message="Car can't be older than 1900")
	@Max(value=2021,message="Car can't be newer than 2021")
	private Integer carYear; // use Integer to trim white spaces
	@Valid
	@NotNull(message="is required")
	@Size(min=3,message="is required")
	private String carModel;
	private String country;
	@NotNull(message="is required")
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
	
	public Integer getCarYear() {
		return carYear;
	}

	public void setCarYear(Integer carYear) {
		this.carYear = carYear;
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
