package com.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.user.entities.User;
import com.user.form.RegisterUserForm;
import com.user.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public User saveUser(RegisterUserForm registerUserform) {
		User user = new User();
		user.setAge(registerUserform.getAge());
		user.setEmail(registerUserform.getEmail());
		user.setName(registerUserform.getName());
		user.setPassword(passwordEncoder.encode(registerUserform.getPassword()));
		// TODO Auto-generated method stub
		
		User u = userRepository.save(user);
		
		return u;
	}
	
	
}
