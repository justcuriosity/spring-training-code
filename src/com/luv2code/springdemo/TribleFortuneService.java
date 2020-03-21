package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class TribleFortuneService implements FortuneService {
	
	List<String> fortunesList = new ArrayList<>();
	
	public TribleFortuneService() {
		fortunesList.add("Today is your day!");
		fortunesList.add("Just Do It!");
		fortunesList.add("Go Tiger!");
	}
	
	@Override
	public String getFortune() {
		int randomNum = ThreadLocalRandom.current().nextInt(0, 2 + 1);
		return fortunesList.get(randomNum);
	}

}
