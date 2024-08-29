package com.railway.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.railway.model.User;
import com.railway.repo.UserRepo;
import com.railway.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo repo;

	@Override
	public User createUser(User user) {

		return repo.save(user);
	}

}
