package com.luv2code.springdemo.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.luv2code.springdemo.intf.Coach;

@Component
public class SwimCoach implements Coach {
	
	@Value("${foo.email}")
	public String email;
	
	@Value("${foo.team}")
	public String team;

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String getEmail() {
		return this.email;
	}

}
