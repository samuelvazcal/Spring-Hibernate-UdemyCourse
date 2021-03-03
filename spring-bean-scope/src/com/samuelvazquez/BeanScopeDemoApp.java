package com.samuelvazquez;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		//load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean from Spring container
		Coach coachA = context.getBean("myCoach", Coach.class);

		Coach coachB = context.getBean("myCoach",Coach.class);
		
		//check if they are the same bean
		boolean result = (coachA.equals(coachB));		
		
		System.out.println("\nPointing to the same object? " + result);
		
		System.out.println("Memory location for coachA: " + coachA);
		System.out.println("Memory location for coachB: " + coachB);
		
		//close the context
		context.close();
	}

}
