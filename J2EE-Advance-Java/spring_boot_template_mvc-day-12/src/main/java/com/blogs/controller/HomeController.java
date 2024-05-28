package com.blogs.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method =RequestMethod.GET )
	public String showLoginForm() {

		System.out.println("Inside HomeController");
		
		return "/users/login";
	}
	
	@RequestMapping("/logout")
	public String logout(HttpSession session) {
		
		System.out.println(session.getId() + " In logout handler before Logout");
		session.invalidate();
		
		return "redirect:/";
	}
}
