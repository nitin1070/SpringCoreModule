package com.ambiguity.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCricket {

	public static void main (String [] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/ambiguity/example/CricketConfig.xml");
		
		CricketBean b = (CricketBean)context.getBean("cricketBean");
		/*
		 * CricketBean b2 = (CricketBean)context.getBean("cricketBean2");
		 */
		
		
	
	}
} 
