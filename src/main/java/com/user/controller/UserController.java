package com.user.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.user.entities.User;
import com.user.form.LoginForm;
import com.user.form.RegisterUserForm;
import com.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService userService;

	
	@PostMapping("/registration")
	public String registerUser() {
		return "index";
	}
	
	@GetMapping("/login") 
	public String loginUser(Model m) {
		m.addAttribute(new LoginForm());
		System.out.println("login hello world login");
		return "login";
	}
	
	
	
	@GetMapping("/register")
	public String preRegister(Model m) {
		m.addAttribute(new RegisterUserForm());
		return "register";
	}
	
	@GetMapping("/welcome")
	public String welcome() {
		return "welcome";
	}
	
	@PostMapping("/registeruser")
	public String registerUser(@ModelAttribute("registerUserForm") RegisterUserForm registerUserForm, Map<String, Object> modelMap) {
		
		try {
			System.out.println(registerUserForm);
			
			User user = userService.saveUser(registerUserForm);
			
			if(user.getUserId() > 0) {
				modelMap.put("message", "registered user successfully");
				System.out.println("user saved");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			modelMap.put("message", "error saving user");
			e.printStackTrace();
		}
		

		return "register";
	}
	
}
