package com.springcore.autowire;

public class Address {
	
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + "]";
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
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
