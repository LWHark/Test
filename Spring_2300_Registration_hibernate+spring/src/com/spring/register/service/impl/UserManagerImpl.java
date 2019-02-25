package com.spring.register.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.spring.register.dao.UserDao;
import com.spring.register.model.User;
import com.spring.register.service.UserManager;

@Component("userManager")
public class UserManagerImpl implements UserManager {
	private UserDao userDao;
	
	public boolean add(User user) {
		boolean boo = true;
		boo = userDao.save(user);
		return boo;
	}

	public boolean exists(User user) {
		boolean boo = true;
		boo = userDao.exists(user);
		return boo;
	}

	public UserDao getUserDao() {
		return userDao;
	}
	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
}
