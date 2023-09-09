package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/autowire/annotation/autowireAnnotation.xml");
		
		Emp e =context.getBean("emp",Emp.class);
		
	   
		
		System.out.println(e);
		
		

	}

}

