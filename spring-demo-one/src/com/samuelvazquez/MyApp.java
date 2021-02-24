package com.samuelvazquez;

public class MyApp {

	public static void main(String[] args) {
		
		//create the object
		Coach coach = new TrackCoach();
		
		//use the object
		//can work with ANY Coach implementation, we are coding to the interface
		//not the implementation 
		System.out.println(coach.getDailyWorkout());

	}

}
