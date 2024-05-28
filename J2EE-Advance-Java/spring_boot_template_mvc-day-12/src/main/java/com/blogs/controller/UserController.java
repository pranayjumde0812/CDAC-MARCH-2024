package com.blogs.controller;

import javax.servlet.http.HttpSession;

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

	@PostMapping("/login")
	public String login(@RequestParam("email") String email, @RequestParam("password") String password, Model model,
			HttpSession session) {

		try {
			User userSignIn = userService.userSignIn(email, password);
			// check for role

//			model.addAttribute("user", userSignIn);
			session.setAttribute("user", userSignIn);
			session.setAttribute("message", "Logged In Successfully " + userSignIn.getFirstName());

			System.out.println(session.getId() + " In User Controller");
			
			if (userSignIn.getRole() == Role.ADMIN)
				return "redirect:/admin/dashboard";
			return "redirect:/blogger/dashboard";
		} catch (Exception e) {
			e.printStackTrace();
//			model.addAttribute("error", "invalid credentials");
			System.out.println(session.getId() + " In User Controller in catch block");
			session.setAttribute("message", "Invalid Credentials... Please Try Again");

			return "redirect:/";
		}

	}
}
