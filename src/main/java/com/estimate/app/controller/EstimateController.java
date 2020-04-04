package com.estimate.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EstimateController {
	
	@RequestMapping(value ="/")
	public String getData(){
		return "Connected";
	}
	
	@GetMapping(value ="/welcome")
	public String welcomeMessage(){
		return "Welcome to the Game";
	}
	
}
