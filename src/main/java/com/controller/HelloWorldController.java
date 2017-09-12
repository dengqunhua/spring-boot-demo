package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.UserProperties;

@RestController
public class HelloWorldController {
	@Autowired
	private UserProperties userProperties;
	
	@RequestMapping("/hello")
	public String hello(){
		return "hello "+userProperties.getName();
	}
}
