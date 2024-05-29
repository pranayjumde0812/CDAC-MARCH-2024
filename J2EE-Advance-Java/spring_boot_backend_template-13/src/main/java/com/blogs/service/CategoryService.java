package com.blogs.service;

import java.util.List;

import com.blogs.entities.Category;

public interface CategoryService {

	List<Category> getAllCategories();

	Category createNewCategory(Category category);

	String deleteCategory(Long id);

	Category getCategoryDetails(Long id);
	
	Category updateCategory(Category category);
}
