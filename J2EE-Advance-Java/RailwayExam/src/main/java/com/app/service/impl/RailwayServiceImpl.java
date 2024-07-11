package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Category;
import com.app.model.Railway;
import com.app.repository.RailwayRepository;
import com.app.service.RailwayService;

@Service
@Transactional
public class RailwayServiceImpl implements RailwayService {

	@Autowired
	private RailwayRepository railwayRepository;

	@Override
	public boolean addRailway(Railway railway) {

		Railway save = railwayRepository.save(railway);

		if (save != null)
			return true;

		return false;
	}

	@Override
	public void deleteRailway(Long id) {
		railwayRepository.deleteById(id);
	}

	@Override
	public List<Railway> findByCategory(Category category) {

		return railwayRepository.findRailwaysByCategory(category);
	}

	@Override
	public Railway getRailwayById(Long id) {

		return railwayRepository.findById(id).get();
	}

	@Override
	public List<Railway> sortByName() {
		// TODO Auto-generated method stub
		return railwayRepository.findAllByOrderByNameAsc();
	}

	@Override
	public boolean updateRailway(Railway railway) {
		Railway railway1 = railwayRepository.findById(railway.getId()).get();
		if(railway1 != null) {
			railwayRepository.save(railway);
			return true;
		}
		return false;
	}

}
