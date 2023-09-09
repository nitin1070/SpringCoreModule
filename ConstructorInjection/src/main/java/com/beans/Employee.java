package com.beans;

public class Employee {
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int age, int id, Address add) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.add = add;
	}
	
	public void show() {
		
		System.out.println("Name of the Employee:"+name);
		System.out.println("Age of the Employee:"+age);
		System.out.println("id of the Employee:"+id);
		System.out.println("Address of the Employee:"+add.toString());
		
		
		
	}
	
	
	
	
	
	
	private String name;
	private int age;
	private int id;
   private Address add;
   
}
