package com.dto;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String street;
	private String area;
	private String city;
	private String state;
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Address(String street, String area, String city, String state) {
		super();
		this.street = street;
		this.area = area;
		this.city = city;
		this.state = state;
	}


	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	

}