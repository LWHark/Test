package com.spring.register.service;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.register.model.User;

public class TestService {
	private static ApplicationContext ctx;
	@Before
	public void bofore() {
		ctx = new ClassPathXmlApplicationContext("beans.xml");
	}
	@After
	public void after(){}
	
	@org.junit.Test
	public void testExists() {
		User user = new User();
		user.setUsername("‰Ï‰Ï”Í–™");
		user.setPassword("a");
		UserManager userManager = (UserManager)ctx.getBean("userManagerImpl");
		boolean boo = userManager.exists(user);
		assertEquals(true, boo);
	}

	@org.junit.Test
	public void testAdd() {
		User user = new User();
		user.setUsername("b");
		user.setPassword("b");
		UserManager userManager = (UserManager)ctx.getBean("userManagerImpl");
		boolean boo = userManager.add(user);
		assertEquals(true, boo);
	}

}
