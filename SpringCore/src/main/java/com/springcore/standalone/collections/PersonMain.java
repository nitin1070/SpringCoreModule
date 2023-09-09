package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collections/standAlone.xml");
		
		PersonBean p =  (PersonBean) context.getBean("personBean");
		
		
		System.out.println(p.getFriends());
		
		System.out.println(p.getRoles());
		
		System.out.println(p.getProp());
		
		
		
	}

}
