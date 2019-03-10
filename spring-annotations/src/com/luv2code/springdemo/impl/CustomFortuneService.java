package com.luv2code.springdemo.impl;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.luv2code.springdemo.intf.FortuneService;

@Component
public class CustomFortuneService implements FortuneService {
	
	private List<String> fortunesList;

	public CustomFortuneService() {
		System.out.println(">>> Inside CustomFortuneService constructor");
		readFile();
	}

	@PostConstruct
	private void readFile() {
		File file = new File("fortunes.list");
		System.out.println("If file exists: " + file.exists());
		try {
			fortunesList = Files.readAllLines(file.toPath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getFortune() {
		Random random = new Random();
		int index = random.nextInt(fortunesList.size());
		
		return fortunesList.get(index);
	}
	
	

}
