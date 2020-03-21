package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from the spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyWorkOut());
		System.out.println(theCoach.getDailyFortune());
		
		//call our new methods to get literal values
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		// triple fortune service
		TennisCoach tennisCoach = context.getBean("myTennisCoach", TennisCoach.class);
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(tennisCoach.getDailyFortune());
		System.out.println(tennisCoach.getDailyFortune());
				
				
		//close the context
		context.close();
	}

}
