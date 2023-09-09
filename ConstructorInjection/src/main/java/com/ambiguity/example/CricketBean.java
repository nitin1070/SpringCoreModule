package com.ambiguity.example;

import java.util.Map;

public class CricketBean {
	

	public CricketBean(int count , int run) {
		
		this.count=count;
		this.run=run;
		System.out.println("int , int constructor calling...");
		
	}
	
public  CricketBean(String teamName, String Country) {
	
	this.teamName=teamName;
	this.country=Country;
	
	System.out.println("String String constructor calling...");
	
}
	
	private String teamName;
	private String country;
	private int count;
	private int run;
	private Map<String, String>playersList;
	
   
	
}
