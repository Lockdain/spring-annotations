package com.luv2code.springdemo.impl;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.intf.FortuneService;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}

}
