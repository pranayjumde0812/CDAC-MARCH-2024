package com.app.service;

import java.util.List;

import com.app.dto.PayloadDTO;
import com.app.model.Category;
import com.app.model.Railway;

public interface RailwayService {

	boolean addRailway(Railway railway);

	void deleteRailway(Long id);

	List<Railway> findByCategory(Category category);

	Railway getRailwayById(Long id);
	
	List<Railway> sortByName();
	
	boolean updateRailway(Railway railway);
	
	int deleteRailwayByName(String name);
	
	List<PayloadDTO> getDetails();
	
	List<Railway> displayAll();
}
