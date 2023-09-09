package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Address {
	
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + "]";
	}
	public String getState() {
		return state;
	}
	
	@Autowired
	public void setState(String state) {
		this.state = state;
		System.out.println(this.state);
	}
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	private String state;
	private String city;
	

}
