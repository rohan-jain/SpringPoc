package com.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@PostMapping("/registration")
	public String registerUser() {
		return "index";
	}
	
	@GetMapping("/login") 
	public String loginUser() {
		System.out.println("login hello world login");
		return "login";
	}
	
}
