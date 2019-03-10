package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.luv2code.springdemo.impl.SwimCoach;
import com.luv2code.springdemo.intf.Coach;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		// read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
//		Coach anotherCoach = context.getBean("randomCoach", Coach.class);
		
		// call methods
		System.out.println(theCoach.getDailyWorkout());
//		System.out.println(anotherCoach.getDailyWorkout());
		
		// call new methods
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
