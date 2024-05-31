package com.app.dao;

import com.app.entities.User;

public interface UserDao {
//add a method for user sign up
	String registerUser(User user);

	// add a method for user sign in
	User authenticateUser(String email, String password);

}
