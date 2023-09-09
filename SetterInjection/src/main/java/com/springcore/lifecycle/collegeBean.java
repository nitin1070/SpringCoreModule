package com.springcore.lifecycle;

public class collegeBean {

	/*
	 * public collegeBean() { super();
	 * 
	 * }
	 */
  
public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("setting name....");
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
		System.out.println("Setting course....");
	}
private String name;
  private String course;
@Override
public String toString() {
	return "collegeBean [name=" + name + ", course=" + course + "]";
}


public void init() {
	
	
	System.out.println("inside init method..");
}

public void destroy() {
	
	System.out.println("Inside destroy method..");
	
}








}
