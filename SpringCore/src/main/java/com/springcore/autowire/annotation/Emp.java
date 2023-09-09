package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {


	public Emp(Address add) {
		super();
		this.add = add;
		System.out.println("Constructor is calling using @Autowired annotation");
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
    
	@Autowired
	@Qualifier("add2")
	private Address add;
	
}
