package com.blogs.controllers;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyHome {

	public MyHome() {
		System.out.println("My home Controller");
	}

	@PostConstruct
	public void myInit() {
		System.out.println("Init method of " + getClass());
	}

	@RequestMapping("/")
	public String showHome() {

		System.out.println("In index me method");

		return "/index";
	}
}
