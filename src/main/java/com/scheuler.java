package com;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class scheuler 
{

	@Scheduled(fixedDelay = 1000L)
	public void getRequest()
	{
		System.out.println("This project is for testing");
	}
}
