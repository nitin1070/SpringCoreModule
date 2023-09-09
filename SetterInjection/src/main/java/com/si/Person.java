package com.si;

import java.util.List;
import java.util.Properties;

public class Person {
	
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", hobbies=" + hobbies + ", prop=" + prop + ", add=" + add
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public PersonAddress getAdd() {
		return add;
	}
	public void setAdd(PersonAddress add) {
		this.add = add;
	}
	private String name;
	private int age;
    private List<String> hobbies;
  private  Properties prop;  
    private PersonAddress add;


    
  
}
