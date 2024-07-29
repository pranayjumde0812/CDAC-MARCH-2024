package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Category;
import com.app.entities.Railway;

public interface RailwayRepo extends JpaRepository<Railway,Long> {
	
	public List<Railway> findAllByCategory(Category category);
	
	public List<Railway> findAllByOrderByNameAsc();

	public List<Railway> findAllByName(String name);

}
