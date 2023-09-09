package com.springcore.ci;

public class SubCar {
	
	public SubCar(String companyName, Car car) {
		super();
		this.companyName = companyName;
		this.car = car;
	}
	private String companyName;
    private Car car;
	@Override
	public String toString() {
		return "SubCar [companyName=" + companyName + ", car=" + car + "]";
	}

}
