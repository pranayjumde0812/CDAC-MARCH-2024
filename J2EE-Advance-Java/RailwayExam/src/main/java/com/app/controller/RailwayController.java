package com.app.controller;

import java.util.List;

import javax.validation.Valid;

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

import com.app.model.Category;
import com.app.model.Railway;
import com.app.service.RailwayService;

@RestController
@RequestMapping("/railways")
public class RailwayController {

	@Autowired
	private RailwayService railwayService;

	@PostMapping("/add")
	public ResponseEntity<?> addRailway(@Valid @RequestBody Railway railway) {

		if (railway.getStartTime().isBefore(railway.getEndTime())) {
			if (railwayService.addRailway(railway)) {
				return new ResponseEntity<>("Inserted Successfully", HttpStatus.CREATED);
			}
		}
		return new ResponseEntity<>("Not Inserted", HttpStatus.BAD_REQUEST);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteRailway(@PathVariable Long id) {

		railwayService.deleteRailway(id);
		return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
	}

	@GetMapping("/getByCategory/{category}")
	public ResponseEntity<?> getByCategoryRailway(@PathVariable Category category) {

		List<Railway> railways = railwayService.findByCategory(category);
		return new ResponseEntity<>(railways, HttpStatus.OK);
	}
	
	@GetMapping("/sortByName")
	public ResponseEntity<?> sortByName() {

		List<Railway> railways = railwayService.sortByName();
		return new ResponseEntity<>(railways, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<?> updateRailway(@Valid @RequestBody Railway railway) {

		if (railway.getStartTime().isBefore(railway.getEndTime())) {
			if (railwayService.updateRailway(railway)) {
				return new ResponseEntity<>("Updated Successfully", HttpStatus.CREATED);
			}
		}
		return new ResponseEntity<>("Not Inserted", HttpStatus.BAD_REQUEST);
	}
}
