package com.app.beans;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

import com.app.dao.CandidateDaoImpl;
import com.app.dao.UserDaoImpl;
import com.app.entities.Candidate;
import com.app.entities.User;

public class UserBean {
//state -- request params from clnt mapped to Java bean properties
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private String dob;
	// dependency -- dao layer
	private UserDaoImpl userDao;
	// add a property to store validated user details
	private User userDetails;
	private String message;

	// def ctor
	public UserBean() throws SQLException {
		// create dao instance
		userDao = new UserDaoImpl();
		System.out.println("user bean created...");
	}

	// getter n setter
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserDaoImpl getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDaoImpl userDao) {
		this.userDao = userDao;
	}

	public User getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(User userDetails) {
		this.userDetails = userDetails;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getMessage() {
		return message;
	}

	// Add B.L method for user authentication
	public String validateUser() throws SQLException {
		System.out.println("in validate user " + email + " " + password);
		// bean --> invokes dao's method
		userDetails = userDao.signIn(email, password);
		if (userDetails == null) {
			// invalid login
			message = "Invalid Email or Password , Please retry!";
			return "login"; // bean returns navigational outcome to jsp ,(tells jsp where to take the
							// client)
		}
		// => valid login --> chk role based authorization
		message = "Login Successful!";
		if (userDetails.getRole().equals("admin"))
			return "admin_main";
		// => voter login
		if (userDetails.isStatus())
			return "logout";
		// not yet voted
		return "candidate_list";
	}

	public String validateAndRegister() throws SQLException {

		// parse dob --> LocalDate
		Period dateOfBirth = Period.between(LocalDate.parse(dob), LocalDate.now());

		if (dateOfBirth.getYears() >= 18) {
			Date date = Date.valueOf(LocalDate.parse(dob));
			User user = new User(firstName, lastName, email, password, date);
			String voterRegistration = userDao.voterRegistration(user);
			return voterRegistration;
		}

		return "Something Went Wrong";
	}


}
