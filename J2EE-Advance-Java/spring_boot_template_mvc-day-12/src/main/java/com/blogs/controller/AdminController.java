package com.blogs.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@GetMapping("/dashboard")
	public String adminDashboard(HttpSession session) {
		
		System.out.println(session.getId() + " In Admin Controller");
		
		return "/users/admin/dashboard";
	}
}
