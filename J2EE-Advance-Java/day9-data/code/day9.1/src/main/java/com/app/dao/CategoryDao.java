package com.app.dao;

import com.app.entities.Category;

public interface CategoryDao {
	String addNewCategory(Category category);
	String deleteCategoryDetails(Long nextLong);
	Category getCategoryDetails(String categoryName);
	Category getCategoryAndPostDetails(String categoryName);
}
