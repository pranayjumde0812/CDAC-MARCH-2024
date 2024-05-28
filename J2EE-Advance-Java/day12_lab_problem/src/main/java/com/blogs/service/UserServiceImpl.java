package com.blogs.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogs.custom_exceptions.InvalidCredentialsException;
import com.blogs.entities.User;
import com.blogs.repository.UserRepository;

@Service // mandatory cls level anno to tell SC
//following is spring bean containing B.L
@Transactional // for adding auto tx mamangement support
public class UserServiceImpl implements UserService {
	// dependency
	@Autowired
	private UserRepository userRepository;

	@Override
	public User signInUser(String email, String pwd) {
		Optional<User> optional = userRepository.
				findByEmailAndPassword(email, pwd);
		return optional.orElseThrow(() ->
		new InvalidCredentialsException("Invalid Email or password !!!!"));
	}

}
