package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
@EnableScheduling
public class Demo123Application {

//	public static final Logger LOGGER = 
	
	public static void main(String[] args) {
		SpringApplication.run(Demo123Application.class, args);
	}

}
