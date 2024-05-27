package com.blogs.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
// Mandatory class level Annotation to tell spring container
public class MyController1 {

	public MyController1() {
		System.out.println("in constructor of " + getClass());
	}

//	@PostConstruct
//	public void myInit() {
//		System.out.println("Init method of " + getClass());
//	}
	
	
	/*
	 * @RequestMapping(value = "/") public String showHome() {
	 * 
	 * System.out.println("In index me method");
	 * 
	 * return "/index"; }
	 */

	@RequestMapping(value = "/my-controller1", method = RequestMethod.GET)
//	@GetMapping("/my-controller1")
	public String checkMe() {

		System.out.println("In Check me method");

		return "/display";
	}
}
