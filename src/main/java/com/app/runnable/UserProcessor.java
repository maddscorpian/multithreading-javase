package com.app.runnable;

import java.util.StringTokenizer;
import java.util.concurrent.Callable;

import com.app.bean.User;
import com.app.dao.UserDao;

public class UserProcessor implements Callable<Integer> {

	String userRecord;
	UserDao dao;

	public UserProcessor(String userRecord, UserDao dao) {
		this.dao = dao;
		this.userRecord = userRecord;
	}

	@Override
	public Integer call() throws Exception {
		
		System.out.println("UserProcessor.call");
		StringTokenizer tokens = new StringTokenizer(userRecord, ",");
		User usr = new User();
		
		usr.setEmail(tokens.nextToken());
		usr.setName(tokens.nextToken());
		usr.setId(Integer.valueOf(tokens.nextToken()));
		System.out.println("Created User Bean");
		return this.dao.saveUser(usr);
		
	}

}
