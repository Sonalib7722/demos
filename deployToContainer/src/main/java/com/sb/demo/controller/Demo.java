package com.sb.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo {
	
	@GetMapping("/get")
	public String getData() {
		return "WelcomeToLoveToLearn";
	}

}
