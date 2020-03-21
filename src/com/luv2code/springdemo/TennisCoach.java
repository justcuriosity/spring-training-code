package com.luv2code.springdemo;

public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TennisCoach(FortuneService theFortuneService) {
		System.out.println("inside Tennis Coach Constructor");
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Work Hard!";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
