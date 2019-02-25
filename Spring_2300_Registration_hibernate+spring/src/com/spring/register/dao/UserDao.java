package com.spring.register.dao;

import com.spring.register.model.User;

public interface UserDao {
	boolean save(User user);
	boolean exists(User user);
}
