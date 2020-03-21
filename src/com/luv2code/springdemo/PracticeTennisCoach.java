package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeTennisCoach {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// triple fortune service
		TennisCoach tennisCoach = context.getBean("myTennisCoach", TennisCoach.class);
		TennisCoach badAssCoach = context.getBean("myTennisCoach", TennisCoach.class);
		
		boolean result = (tennisCoach == badAssCoach);
		System.out.println(result);
						
		//close the context
		context.close();

	}

}
