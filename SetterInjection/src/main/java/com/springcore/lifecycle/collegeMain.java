package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class collegeMain {

	public static void main(String[] args) {
		
		
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/applicationContext.xml",
				"com/springcore/lifecycle/annotationConfig.xml");
		
		collegeBean c = (collegeBean)context.getBean("collegeBean");
		
		collegeBean2 c2 = (collegeBean2)context.getBean("collegeBean2");
		
		collegeBean3 c3 = (collegeBean3)context.getBean("collegeBean3");
		
		
	
		   System.out.println(c);
		   
		   
		// registerShutdownHook is call for destroy method its available in AbstractApplicationContext Interface 
		 context.registerShutdownHook();
		 
		 
		 
		System.out.println("============Using Interface===========");
		
		System.out.println(c2);
		
		
		 
		System.out.println("============Using Annotation===========");
		System.out.println(c3);
	  
	  

	}

}
