package com.app.dao;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import com.app.entities.Role;
import com.app.entities.User;

public interface UserDao {

	// add a method for user sign up
	String registerUser(User user);

	// add a method to get user details by it's id
	User getUserDetails(Long userId);

	// add a method to return list of all users
	List<User> getAllUsers();

	// add a method to return list of users by dob range n role
	List<User> getAllUsersByDobAndRole(LocalDate start, LocalDate end, Role role);

	// add a method for user sign in
	User authenticateUser(String email, String password);

	// add a method for user's change password
	String changePassword(String email, String oldPwd, String newPwd);

	// add a method to get all user first names born
	// between strt date n end date & under a specific role
	List<String> getFirstNamesByDateNRole(LocalDate start, LocalDate end, Role role);

	// add a method to get first name,dob n phone born
	// between strt date n end date
	List<User> getDetailsByDate(LocalDate start, LocalDate end);

	// apply discount in reg amount , reged before a date
	String applyDiscount(LocalDate date, Role role, double amount);

	// delete user details
	String unsubscribeUser(Long userId);

	// store the image in db , for specific user
	String storeImage(String email, String fileName) throws IOException;

	// restore the image from db , for specific user , in a bin file
	String restoreImage(String email, String newFileName) throws IOException;

}
