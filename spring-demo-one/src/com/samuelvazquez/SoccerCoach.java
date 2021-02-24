package com.samuelvazquez;

public class SoccerCoach implements Coach{
	@Override
	public String getDailyWorkout() {
		return "Spend 20 minutes shooting from a square pass";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
