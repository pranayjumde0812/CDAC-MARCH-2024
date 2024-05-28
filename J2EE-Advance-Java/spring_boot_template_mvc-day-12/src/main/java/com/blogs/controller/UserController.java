package com.blogs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.blogs.entities.Role;
import com.blogs.entities.User;
import com.blogs.repository.UserRepository;
import com.blogs.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {

//		System.out.println(email);
//		System.out.println(password);

		try {
			User userSignIn = userService.userSignIn(email, password);
			// check for role

			model.addAttribute("user", userSignIn);
			if (userSignIn.getRole() == Role.ADMIN)
				return "/users/admin/dashboard";
			return "/users/blogger/dashboard";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("error", "invalid credentials");

			return "/users/login";
		}

	}
}
