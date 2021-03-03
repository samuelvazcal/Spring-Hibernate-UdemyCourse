package com.samuelvazquez;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		//ArtificialMechanism robot = context.getBean("myRobot",ArtificialMechanism.class);
		KidRobot kidRobot = context.getBean("myKidRobot",KidRobot.class);
		
		//call methods on the bean
		//robot.walk();
		kidRobot.walk();
		
		//call new method on the bean
		//robot.doSubtask1();
		kidRobot.doSubtask1();
		
		//calling literal values
		System.out.println(kidRobot.getName());
		System.out.println(kidRobot.getBrand());
		
		//close the context
		context.close();
	}

}
