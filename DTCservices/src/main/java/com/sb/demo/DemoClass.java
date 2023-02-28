package com.sb.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoClass {
	
	@GetMapping("/get")
	public String getData() {
		return "Welcome to demo page new change........";
	}

}
