package com.springcore.autowire;

public class Emp {

	public Emp(Address add) {
		super();
		this.add = add;
		System.out.println("INSIDE CONSTRUCTOR");
	}
	
	public Emp() {
		
		super();
	}
	
	
	

	public Address getAdd() {
		
		return add;
	}

	@Override
	public String toString() {
		return "Emp [add=" + add + "]";
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	private Address add;
	
}
