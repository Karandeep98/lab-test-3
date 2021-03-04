package com.trainee_management.service;

import com.trainee_management.dao.user.User;

public interface UserService {
	public void addUser(User user);
	public User getUser(String username, String password);
}
