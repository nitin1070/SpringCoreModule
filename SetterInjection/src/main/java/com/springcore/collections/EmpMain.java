package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {

	public static void main(String [] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionConfig.xml");
		
		Employee emp=(Employee) context.getBean("EmpBean");
		
		System.out.println(emp.getName());
		System.out.println(emp.getPhones());
		System.out.println(emp.getAddresses());
		System.out.println(emp.getCourses());
		
	}
}
