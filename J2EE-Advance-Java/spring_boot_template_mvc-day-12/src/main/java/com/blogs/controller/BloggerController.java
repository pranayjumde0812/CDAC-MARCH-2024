package com.blogs.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blogger")
public class BloggerController {

	@GetMapping("/dashboard")
	public String bloggerDashboard(HttpSession session) {

		System.out.println(session.getId() + " In Blogger Controller");
		return "/users/blogger/dashboard";
	}
}
