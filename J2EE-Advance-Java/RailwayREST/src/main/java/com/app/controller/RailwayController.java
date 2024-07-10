package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Railway;
import com.app.service.RailwayService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/railway")
public class RailwayController {

	@Autowired
	private RailwayService railwayService;

	@PostMapping("/addrailway")
	public ResponseEntity<?> addRailway(@RequestBody Railway railway) {

		System.out.println(railway.getDestination());
		System.out.println(railway.getName());
		
		if (railway != null) {
			railwayService.addRailway(railway);
			return ResponseEntity.status(201).body("Inserted Successfully");
		}
		return ResponseEntity.status(401).body("Not Inserted");
	}
}
