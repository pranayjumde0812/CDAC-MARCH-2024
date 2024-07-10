package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.Railway;
import com.app.repository.RailwayRepository;
import com.app.service.RailwayService;

@Service
@Transactional
public class RailwayServiceImpl implements RailwayService {

	@Autowired
	private RailwayRepository railwayRepository;

	@Override
	public void addRailway(Railway railway) {
		
			railwayRepository.save(railway);
		
	}

}
