package com.railway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.railway.model.User;
import com.railway.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping("/users")
	public User createUser(@RequestBody User user) {
		return service.createUser(user);
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return se
	}
}
