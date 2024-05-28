package com.blogs.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogs.custom_exception.InvalidCredentialsException;
import com.blogs.entities.User;
import com.blogs.repository.UserRepository;
import com.blogs.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public User userSignIn(String email, String password) {

		Optional<User> user = userRepo.findByEmailAndPassword(email, password);
		

		return user.orElseThrow(() -> new InvalidCredentialsException("Invalid Email or Password"));
	}
	
	

}
