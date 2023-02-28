package com.sb.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/get")
	public String getData() {
		return "Welcome to demo page";
	}
}
