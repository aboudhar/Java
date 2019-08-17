package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load Spring Configuration File 
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve the bean from Spring Container
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		//call Methods on the bean 
		System.out.println(theCoach.getDailyWorkout());
		//close the Context
		context.close();
		
	}

}
