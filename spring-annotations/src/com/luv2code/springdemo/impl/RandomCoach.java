package com.luv2code.springdemo.impl;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.intf.Coach;

@Component
public class RandomCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Hi there! I'm a bit random.";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
