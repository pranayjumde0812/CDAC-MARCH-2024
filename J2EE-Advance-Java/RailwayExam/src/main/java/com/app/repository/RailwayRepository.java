package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Category;
import com.app.model.Railway;

@Repository
@Transactional
public interface RailwayRepository extends JpaRepository<Railway, Long> {

	List<Railway> findRailwaysByCategory(Category category);

	List<Railway> findAllByOrderByNameAsc();

	@Modifying
	@Query("delete from com.app.model.Railway rail where rail.name = :name")
	int deleteAllByName(String name);
}
