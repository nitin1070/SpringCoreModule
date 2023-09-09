package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Employee;

public class DependentObjCIEX {
	
	public static void main(String [] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("dependentCI.xml");
		
		Employee e=(Employee)context.getBean("empbean");
		
      	e.show();
		
		
		
		
		
		
	}

}
