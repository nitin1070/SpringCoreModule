package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class collegeBean3 {
	
	@Override
	public String toString() {
		return "collegeBean3 [batch=" + batch + "]";
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	private String batch;

	
	// use @PostConstruct & @PreDestroy Annotation to call the init & destory method 
	
	@PostConstruct
	public void start() {
		
		
		System.out.println("start is calling using @PostConstruct Annotation");
		
		
	}
	
	@PreDestroy
	public void end() {
		
		
		System.out.println("End is calling using @PreDestroy Annotation");
		
		
	}
	

}
