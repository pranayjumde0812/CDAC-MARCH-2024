package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ProductDTO;
import com.app.entities.Category;
import com.app.service.ProductService;



@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService productService;

	// any one should be able view the products w/o authentication -permit all
	@GetMapping("/view")
	public ResponseEntity<?> viewProducts() {
		return ResponseEntity.ok
				(productService.getAllProducts());
	}

	// any authenticated user should be able to browse the categories
	@GetMapping("/browse_categories")
	public  ResponseEntity<?>browseCategories() {
		return ResponseEntity.ok
				(Category.values());
	}

	// customer should be able to purchase products
	@PutMapping("/purchase/{id}/{qty}")
	public ResponseEntity<?> purchaseProducts(@PathVariable Long id,
			@PathVariable int qty) {
		return ResponseEntity.ok
				(productService.purchase(id,qty));
	}

	// admin should be able to add the products
	@PostMapping("/add")
	public  ResponseEntity<?> addProduct(@RequestBody ProductDTO product) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(productService.addProduct(product));
	}

	// admin should be able to delete the products
	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteProducts(@PathVariable Long id) {
		return ResponseEntity.ok
				(productService.deleteProductDetails(id));
	}

}
