package com.springcore.ci;

import java.util.List;

public class Car {
	
	public Car(String name, String model, int milege, List<String> carColors) {
		super();
		this.name = name;
		this.model = model;
		this.milege = milege;
		this.carColors = carColors;
	}
	private String name;
	private String model;
	private int milege;
	private List<String> carColors;
	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", milege=" + milege + ", carColors=" + carColors + "]";
	}
	

}
