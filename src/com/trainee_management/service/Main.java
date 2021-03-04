package com.trainee_management.service;

import com.trainee_management.dao.user.User;

public class Main {
	
	public static void main(String[] args) {
		UserService service=new UserServiceImpl();
		User user=new User("sunita", "sun123", "emp");
		service.addUser(user);
		
		//
		User user2=service.getUser("sunita", "sun123");
		System.out.println(user2);
	}

}
