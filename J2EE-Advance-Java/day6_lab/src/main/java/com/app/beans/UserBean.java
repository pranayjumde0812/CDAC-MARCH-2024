package com.app.beans;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;

import com.app.dao.UserDaoImpl;
import com.app.entities.User;

public class UserBean {
//state -- request params from clnt mapped to Java bean properties
	private String email;
	private String password;
	// add more properties for voter registration
	private String fn;
	private String ln;
	private String dob;// dob : String since WC CAN NOT translate from string based req params --> to
						// non primitive props.

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

	public String getMessage() {
		return message;
	}

	public String getFn() {
		return fn;
	}

	public void setFn(String fn) {
		this.fn = fn;
	}

	public String getLn() {
		return ln;
	}

	public void setLn(String ln) {
		this.ln = ln;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	// Add B.L method for user authentication
	public String validateUser() throws SQLException {
		System.out.println("in validate user " + email + " " + password);
		// bean --> invokes dao's method
		userDetails = userDao.signIn(email, password);
		if (userDetails == null) {
			// invalid login
			message = "Invalid Email or Password , Please retry!";
			return "login";// Bean rets navigational outcome to JSP(tells JSP , where to take the clnt
							// next)
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

	// add a B.L method for validating i/ps n then registration
	public String validateAndRegister() throws SQLException{
		// parse dob --> LocalDate n validate
		LocalDate birthDate = LocalDate.parse(dob);
		int ageInYears = Period.between(birthDate, LocalDate.now()).getYears();
		// in case of invalid age --ret err mesg
		if (ageInYears < 21)
			return "registration failed";
		// valid age , create User(Voter) instance
		User voter = new User(fn, ln, email, password,
				Date.valueOf(birthDate));
		// o.w invoke dao's method for reg.
		return userDao.voterRegistration(voter);
	}

}
