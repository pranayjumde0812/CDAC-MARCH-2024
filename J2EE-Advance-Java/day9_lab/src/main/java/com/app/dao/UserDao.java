package com.app.dao;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import com.app.entities.Address;
import com.app.entities.Role;
import com.app.entities.User;

public interface UserDao {
//add a method for user sign up
	String registerUser(User user);

	// add a method for user sign in
	User authenticateUser(String email, String password);

	// add a method for assigning user address
	String assignAddress(Address address, Long userId);

	List<User> getUserNamesByCity(String city);

}
