package com.springcore.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.beans.Student;

public class App 
{
    public static void main( String[] args )
    {
      
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
       Student s= (Student) context.getBean("studentbean");
       Student s2=(Student) context.getBean("studentbean2");
       Student s3=(Student) context.getBean("studentbean3");
       
       
       System.out.println(s);

       System.out.println(s2);
       System.out.println(s3);
    }
}
