package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.Category;
import com.app.model.Railway;

@Repository
public interface RailwayRepository extends JpaRepository<Railway, Long> {

	List<Railway> findRailwaysByCategory(Category category);

	List<Railway> findAllByOrderByNameAsc();

}
