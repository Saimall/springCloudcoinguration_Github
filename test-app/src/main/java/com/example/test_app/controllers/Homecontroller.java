package com.example.test_app.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {
	
	@Value("${server.port}")
	String port;
	
	@Value("${server.app}")
	String nameString;
	
	@RequestMapping("/hello")
	public String hello() {
		return nameString+" "+port;
	}

}
