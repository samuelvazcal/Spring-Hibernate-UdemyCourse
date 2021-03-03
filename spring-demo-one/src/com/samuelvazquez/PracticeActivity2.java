package com.samuelvazquez;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeActivity2 {

	public static void main(String[] args) {
		//load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//retrieve bean
		SwimmingCoach coach = context.getBean("mySwimmingCoach",SwimmingCoach.class);
		
		//call methods on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());

	}

}
