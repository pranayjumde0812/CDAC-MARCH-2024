package com.blogs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blogs.service.BlogPostService;

@Controller
@RequestMapping("/blogger")
public class BloggerController {
	// depcy
	@Autowired
	private BlogPostService blogService;

	public BloggerController() {
		System.out.println("in ctor of " + getClass());
	}

	// add req handling method to forward blogger to the home page
	// URL - http://host:port/spring_boot/blogger/home
	// method : GET
	@GetMapping("/home")
	public String bloggerHome(Model modelMap) {
		System.out.println("in blogger home " + modelMap);
		modelMap.addAttribute("blog_posts", blogService.getSelectedDetails());
		return "/blogger/home";
	}

}
