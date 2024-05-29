package com.blogs.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogs.custom_exception.InvalidCategoryIdException;
import com.blogs.entities.Category;
import com.blogs.repository.CategoryRepository;
import com.blogs.service.CategoryService;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> getAllCategories() {

		return categoryRepository.findAll();
	}

	@Override
	public Category createNewCategory(Category category) {

		return categoryRepository.save(category);
	}

	@Override
	public String deleteCategory(Long id) {

		if (categoryRepository.existsById(id)) {
			categoryRepository.deleteById(id);
			return "Deleted Successfully";
		}

		return "Invalid category Id";
	}

	@Override
	public Category getCategoryDetails(Long id) {

		Optional<Category> findById = categoryRepository.findById(id);

		return findById.orElseThrow(() -> new InvalidCategoryIdException("Invalid Category Id"));
	}

	@Override
	public Category updateCategory(Category category) {

		return categoryRepository.save(category);
	}

}
