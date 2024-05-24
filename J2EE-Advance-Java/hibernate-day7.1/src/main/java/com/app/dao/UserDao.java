package com.app.dao;

import java.time.LocalDate;
import java.util.List;

import com.app.entities.Role;
import com.app.entities.User;

public interface UserDao {

	// add a method for user sign up
	String registerUser(User user);

	// add a method to get user details by it's id
	User getUserDetails(Long userId);

	// Get All the user via jpql
	List<User> getAllUsers();

	// Get Users on DOB and role
	List<User> getAllUserBetweenDob(LocalDate start, LocalDate end, Role role);

	// get user by email and password
	User findByEmailAndPassword(String email, String password);
}
