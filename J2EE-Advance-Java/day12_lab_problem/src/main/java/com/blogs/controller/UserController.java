package com.blogs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blogs.entities.Role;
import com.blogs.entities.User;
import com.blogs.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserService userService;

//add a method for processing login form
	@PostMapping("/login")
	/*
	 * @RequestParam : method arg level annotation to bind request parameters to
	 * method args Done auto by SC Should match req param names to method arg names
	 */
	public String processLoginForm(@RequestParam String email, @RequestParam String password, Model map) {
		System.out.println("in process login form " + email + " " + password);
		try {
			// invoke service layer method
			User user = userService.signInUser(email, password);
			// => login successful
			// add user details n message -- under model attribute
			map.addAttribute("message", "Login Successful");
			map.addAttribute("user_details", user);
			// chk the role --in case of admin -- forward the clnt admin home page
			if (user.getRole() == Role.ADMIN)
				return "/admin/home";
			return "/blogger/home";

		} catch (RuntimeException e) {
			System.out.println("err " + e);
			// => invalid login , forward the clnt to the login form
			// , highlighted with errs
			map.addAttribute("message", e.getMessage());
			return "/users/login";// AVN : /WEB-INF/views/users/login.jsp

		}
	}
}
