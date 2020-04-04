package com.estimate.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class EstimateMain {

	public static void main(String[] args) {
		
		SpringApplication.run(EstimateMain.class, args);
	}
}

@RestController
class EstimateController {
	
	@RequestMapping(value ="/")
	public String getData(){
		return "Connected";
	}
	
	@GetMapping(value ="/welcome")
	public String welcomeMessage(){
		return "Welcome to the Game";
	}	
}