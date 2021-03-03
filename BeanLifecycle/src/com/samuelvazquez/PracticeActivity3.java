package com.samuelvazquez;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeActivity3 {

	public static void main(String[] args) {
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopePractice-applicationContext.xml");
		
		//retrieve spring bean from container
		SwimmingCoach coach1 = context.getBean("mySwimmingCoach",SwimmingCoach.class);
		SwimmingCoach coach2 = context.getBean("mySwimmingCoach",SwimmingCoach.class);
		//verify singleton and prototype scope
		boolean result = (coach1.equals(coach2));
		System.out.println("Do coach1 & coach2 point to the same reference? " + result);
		System.out.println("Memory address for coach1: " + coach1);
		System.out.println("Memory address for coach2: " + coach2);
		
		//close context
		context.close();

	}

}
