package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.RailwayDto;
import com.app.entities.Category;
import com.app.entities.Railway;
import com.app.exception.InvalidCredentialException;
import com.app.repository.RailwayRepo;
import com.app.services.RailwayService;

@RestController
@RequestMapping("/railway")
public class RailwayController {

	@Autowired
	public RailwayService railService;

	public RailwayController() {
	}

	@PostMapping
	public ResponseEntity<?> addNewRail(@RequestBody Railway railway) throws InvalidCredentialException {
		railService.addNewRailway(railway);
		return ResponseEntity.status(HttpStatus.CREATED).body("Railway inserted");
	}

	@GetMapping
	public ResponseEntity<?> displayAllRail() {
		railService.displayAll();
		return ResponseEntity.status(HttpStatus.OK).body("Railway details");
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(Long id) {
		railService.deleteRailById(id);
		return ResponseEntity.status(HttpStatus.OK).body("Deleted successfully");
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getRailById(@PathVariable Long id) {
		Railway railById = railService.getRailById(id);
		if (railById != null) {
			return ResponseEntity.status(HttpStatus.OK).body("Railway details by id");
		}
		return ResponseEntity.status(HttpStatus.OK).body("Id not found");
	}

	@GetMapping("/getbyname/{name}")
	public ResponseEntity<?> getRailByName(@PathVariable String name) {
		 railService.searchByName(name);
		return ResponseEntity.status(HttpStatus.OK).body("Railway Details by name...");
	}

	@GetMapping("/getall/{category}")
	public ResponseEntity<?> getRailByCategory(@PathVariable Category category) {
		 railService.searchByCategory(category);
		return ResponseEntity.status(HttpStatus.OK).body("Railway details by category..");
	}

	@GetMapping("/sort")
	public ResponseEntity<?> sortByName() {
		 railService.findAllByOrderByNameAsc();
		 return ResponseEntity.status(HttpStatus.OK).body("Sorted successfully...");
	}

	@GetMapping("/payload")
	public ResponseEntity<?> displayPayload() {
		 railService.getAllDto();
		return ResponseEntity.status(HttpStatus.OK).body("Payroll details...");
	}

	@PutMapping("/update")
	public ResponseEntity<?> updateRail(@RequestBody Railway railway) {
		railService.updateDetails(railway);
		return ResponseEntity.status(HttpStatus.OK).body("Updated successfully...");
	}

}
