package com.beans;

public class Address {
 
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
	public int getPostcode() {
		return postcode;
	}
	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}
	private String city;
	private String state;
	private int postcode;
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", postcode=" + postcode + "]";
	}
}
