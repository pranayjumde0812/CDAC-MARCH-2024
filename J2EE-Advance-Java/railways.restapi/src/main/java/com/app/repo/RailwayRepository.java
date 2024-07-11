package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.app.entites.Category;
import com.app.entites.Railway;

public interface RailwayRepository extends JpaRepository<Railway, Integer> {
	
	@Query ("select  r from Railway r where r.category=:cat")
	List<Railway> getListByCategory(Category cat);
	@Modifying
	@Query("Update Railway r set r.source=:src where r.id=:id")
	Railway updateRailSrc(String src,int id);

}
