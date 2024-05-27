package com.blogs.controllers;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class MyTestController {

	public MyTestController() {
		System.out.println("In MystestController");
	}

	@GetMapping("/test1")
	public ModelAndView showTest1() {

		System.out.println("Inside Test 1 ");
		
		return new ModelAndView("/test/display", "server_ts", LocalDateTime.now());
	}
	
	@GetMapping("/test2")
	public ModelAndView showTest2() {

		System.out.println("Inside Test 1 ");
		return new ModelAndView("/test/display", "server_ts", LocalDateTime.now());
	}
}
