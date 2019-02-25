package com.spring.register.action;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.register.info.UserInfo;

public class TestAction {
	private static ApplicationContext ctx;
	@Before
	public void bofore() {
		ctx = new ClassPathXmlApplicationContext("beans.xml");
	}
	@After
	public void after(){}
	@Test
	public void testExecute() throws Exception {
		UserAction userAction = (UserAction)ctx.getBean("userAction");
		UserInfo userInfo = new UserInfo();
		userInfo.setUsername("c");
		userInfo.setPassword("c");
		userInfo.setPassword2("c");
		String str = userAction.execute();
		//assertEquals("success", str);
		assertEquals("error", str);
	}

}
