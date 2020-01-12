package com.user.service;

import com.user.entities.User;
import com.user.form.RegisterUserForm;

public interface UserService {
	public User saveUser(RegisterUserForm registerUserform);
}
