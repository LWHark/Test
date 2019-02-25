package com.spring.register.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.spring.register.info.UserInfo;
import com.spring.register.model.User;
import com.spring.register.service.UserManager;
import com.spring.register.service.impl.UserManagerImpl;

@Component("userAction")
@Scope("prototype")
public class UserAction extends ActionSupport /*implements ModelDriven<UserInfo>*/ {
	
	public UserInfo getUserInfo() {
		return userInfo;
	}
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}
	
	private static final long serialVersionUID = 1L;
	private UserManager userManager;
	private UserInfo userInfo = new UserInfo();
	
	public UserManager getUserManager() {
		return userManager;
	}
	@Resource
	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	@Override
	public String execute() throws Exception {
		boolean boo = true;
		if(userInfo.getPassword() != userInfo.getPassword2()) return "error";
		User user = new User();
		user.setUsername(userInfo.getUsername());
		user.setPassword(userInfo.getPassword());
		if(userManager.exists(user)) {
			boo = false;
		} else if(userManager.add(user)) {
			boo = true;
		} else {
			boo = false;
		}
		if(boo) {
			return "success";
		} else {
			return "error";
		}
	}
	/*@Override
	public UserInfo getModel() {
		return userInfo;
	}*/
	
}
