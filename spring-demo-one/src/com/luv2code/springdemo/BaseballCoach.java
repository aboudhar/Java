package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	
	
	//define private field 
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection 
	public BaseballCoach(FortuneService thefortuneService) {
		
		fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "spend 30 minutes on ....";
			}

	@Override
	public String getDailyFortune() {
		
		//use FortuneService
		return this.fortuneService.getFortune();
	} 

}
