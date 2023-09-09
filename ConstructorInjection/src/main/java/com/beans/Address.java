/**
 * 
 */
package com.beans;

/**
 * @author Dell
 *
 */
public class Address {
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	private String city;
	private String state;
	private String country;
	

}
