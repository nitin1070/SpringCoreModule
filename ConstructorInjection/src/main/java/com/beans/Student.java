package com.beans;

public class Student {
	
	/*
	 * public Student(int age) { super(); this.age = age; } public Student(String
	 * name) { super(); this.name = name; }
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void show() {
		
		System.out.println("Name is :"+name +"Age is :"+age);
		
		
	}
	
	private String name;
	private int age;
	

}
