package com.beans;

public class Student {
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", add=" + add + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("setting name...");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		
		System.out.println("setting id...");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		System.out.println("setting age...");
	}
	private String name;
	private int id;
	private int age;
	private Address add;
	
	
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	


}
