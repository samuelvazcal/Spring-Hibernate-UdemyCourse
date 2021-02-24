package com.samuelvazquez;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		//System.out.println("ABNB");
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//load the spring configuration file
		Coach coach = context.getBean("myCoach", Coach.class);
		
		//retrieve bean from spring container
		coach.getDailyWorkout();
		
		//call methods on the bean
		System.out.println(coach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
