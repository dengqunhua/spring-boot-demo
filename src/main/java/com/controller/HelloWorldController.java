package com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
	@Autowired
	private UserProperties userProperties;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "hello "+userProperties.getName();
	}
	
	@RequestMapping(value={"/template","/tpl"})
	public String template(){
		return "index";
	}
}
