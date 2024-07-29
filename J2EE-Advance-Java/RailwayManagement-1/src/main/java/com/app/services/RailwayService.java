package com.app.services;

import java.util.List;

import com.app.dto.RailwayDto;
import com.app.entities.Category;
import com.app.entities.Railway;
import com.app.exception.InvalidCredentialException;

public interface RailwayService {

	public Railway addNewRailway(Railway railway) throws InvalidCredentialException;

	public List<Railway> displayAll();

	public String deleteRailById(Long id);

	public Railway getRailById(Long id);

	public List<Railway> searchByCategory(Category category);

	public List<Railway> findAllByOrderByNameAsc();

	public List<Railway> searchByName(String name);

	public List<RailwayDto> getAllDto();

	public boolean updateDetails(Railway railway);

}
