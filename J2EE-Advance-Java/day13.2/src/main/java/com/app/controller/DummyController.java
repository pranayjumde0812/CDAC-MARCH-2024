package com.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dummy")
public class DummyController {
	public DummyController() {
		System.out.println("in  ctor of " + getClass());
	}

	// add REST API -- to return list of ints
	//URL - http://host:port/dummy  , method -GET
	@GetMapping
	public   List<Integer> getDummyResource() {
		return List.of(10, 20, 30, 40);
	}
}
