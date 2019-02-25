package com.spring.register.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.spring.register.dao.UserDao;
import com.spring.register.model.User;

@Component(value="userDaoImpl")
public class UserDaoImpl implements UserDao {
	private HibernateTemplate hibernateTemplate;
	
	public boolean exists(User user) {
		boolean boo = true;
		List<User> list = hibernateTemplate.findByExample(user);
		if(list != null && list.size() == 0) return false;
		return boo;
	}
	
	public boolean save(User user) {
		boolean boo = true;
		hibernateTemplate.save(user);
		boo = exists(user);
		return boo;
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	@Resource
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
