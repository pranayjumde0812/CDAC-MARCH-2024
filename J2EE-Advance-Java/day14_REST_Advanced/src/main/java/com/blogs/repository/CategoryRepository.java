package com.blogs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogs.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
