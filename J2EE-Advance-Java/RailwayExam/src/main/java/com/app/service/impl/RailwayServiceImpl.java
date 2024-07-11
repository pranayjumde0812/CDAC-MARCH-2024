package com.app.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dto.PayloadDTO;
import com.app.model.Category;
import com.app.model.Railway;
import com.app.repository.RailwayRepository;
import com.app.service.RailwayService;

@Service
@Transactional
public class RailwayServiceImpl implements RailwayService {

	@Autowired
	private RailwayRepository railwayRepository;

	@Autowired
	private ModelMapper modelMapper;

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
		if (railway1 != null) {
			railwayRepository.save(railway);
			return true;
		}
		return false;
	}

	@Override
	public int deleteRailwayByName(String name) {

		return railwayRepository.deleteAllByName(name);
	}

	@Override
	public List<PayloadDTO> getDetails() {

		List<PayloadDTO> list = railwayRepository.findAll().stream()
				.map(railway -> modelMapper.map(railway, PayloadDTO.class)).collect(Collectors.toList());

		return list;
	}

	@Override
	public List<Railway> displayAll() {
		// TODO Auto-generated method stub
		return railwayRepository.findAll();
	}

}
