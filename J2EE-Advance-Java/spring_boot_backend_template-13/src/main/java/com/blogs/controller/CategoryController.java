package com.blogs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogs.dto.ApiResponse;
import com.blogs.entities.Category;
import com.blogs.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;

	@GetMapping("/getCategories")
	public List<Category> getAllCategories() {
		
		return categoryService.getAllCategories();
	}

	@PostMapping("/createCategory")
	public Category createCategory(@RequestBody Category category) {

		System.out.println(category);

		return categoryService.createNewCategory(category);
	}

	@DeleteMapping("/deleteCategory/{catId}")
	public ApiResponse deleteCategory(@PathVariable("catId") Long id) {

		return new ApiResponse(categoryService.deleteCategory(id));
	}

	@GetMapping("/getCategory/{catId}")
	public Category getCategoryDetails(@PathVariable("catId") Long id) {
		return categoryService.getCategoryDetails(id);
	}
	
	@PutMapping("/updateCategory")
	public Category updateCategoryDetails(@RequestBody Category category) {
		
		return categoryService.updateCategory(category);
	}

}
