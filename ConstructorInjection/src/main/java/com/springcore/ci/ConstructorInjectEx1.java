package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

public class ConstructorInjectEx1 {
	public static void main (String [] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student s= (Student)context.getBean("studentbean");
		
		s.show();
		
		
		
		
	}
			
			
			

}
