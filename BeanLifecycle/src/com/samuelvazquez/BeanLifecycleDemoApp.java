package com.samuelvazquez;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {

	public static void main(String[] args) {
		//load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifecycle-applicationContext.xml");
		
		//retrieve bean from Spring container
		Coach coach = context.getBean("myCoach", Coach.class);

		//call method from a bean ready to be used
		System.out.println(coach.getDailyWorkout());
		
		//close the context
		context.close();
	}

}
