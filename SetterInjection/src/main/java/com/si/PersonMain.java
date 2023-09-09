package com.si;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {
	
	public static void main (String [] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/si/PersonConfig.xml","com/si/PersonConfig2.xml","com/si/PersonConfig3.xml");
		
		Person p= (Person)context.getBean("PersonBean");
		
		Person p2= (Person)context.getBean("PersonBean2");
		
		Person  p3 = (Person)context.getBean("PersonBean3");
		
		System.out.println(p);
		
	
		System.out.println(p2);
		System.out.println(p3);
		
	}

}
