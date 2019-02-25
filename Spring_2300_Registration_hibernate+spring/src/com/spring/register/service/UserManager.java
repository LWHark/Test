package com.spring.register.service;

import com.spring.register.model.User;

public interface UserManager {
	boolean exists(User user);
	boolean add(User user);
}
