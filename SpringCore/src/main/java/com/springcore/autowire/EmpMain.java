package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpMain {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("com/springcore/autowire/autowireConfig.xml");
		
		Emp e =context.getBean("emp",Emp.class);
		
		Emp e2 =context.getBean("emp2",Emp.class);
		
		Emp e3 =context.getBean("emp3",Emp.class);
		
		
		System.out.println(e);
		
		System.out.println(e2);
		
		System.out.println(e3);
		

	}

}
