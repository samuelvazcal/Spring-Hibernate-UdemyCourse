package com.samuelvazquez;

public class SwimmingCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimmingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Butterfly swimming for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
