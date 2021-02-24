package com.samuelvazquez;

public class BaseballCoach implements Coach{
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneService to get a fortune
		//So the coach can do daily workouts on his own
		//but for fortunes, he actually needs a helper object( dependency)
		//we're gonna use that dependency that was passed in
		return fortuneService.getFortune() ;
		//So I'm basically helping out the coach by making use of this little helper class 
	}
}
