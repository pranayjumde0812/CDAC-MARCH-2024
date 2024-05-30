package com.blogs.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogs.dto.AuthDTO;

@RestController
@RequestMapping("/users")
public class UserController {

	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody AuthDTO authDTO) {
		return null;
	}
}
