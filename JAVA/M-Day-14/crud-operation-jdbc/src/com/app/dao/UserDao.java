package com.app.dao;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import com.app.entities.User;

public interface UserDao {

	// add a method for user's signin
	User signIn(String email, String password) throws SQLException;

	// add a method for getting user details(not admin) born between dates
	List<User> getUserDetails(Date begin, Date end) throws SQLException;

	// add a method for voter reg.
	String voterRegistration(User newVoter) throws SQLException;

	// update voter Password
	String updateVoterPassword(String email, String oldPassword, String newPassword) throws SQLException;

	// delete voter Password
	String deleteVoter(String email) throws SQLException;

	// cleanup resources
	void cleanUp() throws SQLException;

}
