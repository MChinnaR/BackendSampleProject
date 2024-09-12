package com.SampleBackendApplication.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class userController {

	@RequestMapping("")
	public String returnString() {
		return "Your inside the application";
	}

	@RequestMapping("/")
	public String returnString(@RequestParam String name) {
		return "This is your string " + name;
	}
}
