package com.blogs.service;

import com.blogs.entities.User;

public interface UserService {

	User userSignIn(String email, String password);
}
