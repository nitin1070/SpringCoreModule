package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCar {

	public static void main (String [] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ci/CarConfig.xml",
				"com/springcore/ci/CarConfig2.xml","com/springcore/ci/CarConfig3.xml");
		
		SubCar car= (SubCar) context.getBean("carBean");
		SubCar car2= (SubCar) context.getBean("carBean2");
		SubCar car3 = (SubCar) context.getBean("carBean3");


		
		
		System.out.println(car);

		System.out.println(car2);
		
		System.out.println(car3);
		
		
		
		
		
	}
}
