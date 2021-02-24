package com.samuelvazquez;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeActivity1 {

	public static void main(String[] args) {
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		Coach coach = context.getBean("myNewCoach", Coach.class);
		
		//call methods on the bean
		System.out.println(coach.getDailyWorkout());
		
		//close the context
		context.close();

	}

}
