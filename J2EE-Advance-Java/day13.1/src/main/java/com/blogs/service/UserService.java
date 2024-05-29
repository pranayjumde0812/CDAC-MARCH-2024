package com.blogs.service;

import com.blogs.entities.User;

public interface UserService {
//add a method for user's signin
	User signInUser(String email,String pwd);
}
