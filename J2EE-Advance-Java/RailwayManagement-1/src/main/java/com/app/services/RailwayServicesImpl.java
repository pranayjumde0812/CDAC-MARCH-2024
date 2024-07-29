package com.app.services;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.RailwayDto;
import com.app.entities.Category;
import com.app.entities.Railway;
import com.app.exception.InvalidCredentialException;
import com.app.repository.RailwayRepo;

@Service
@Transactional
public class RailwayServicesImpl implements RailwayService {

	@Autowired
	public RailwayRepo railRepo;
	
	@Autowired
	public ModelMapper mapper;

	@Override
	public Railway addNewRailway(Railway railway) throws InvalidCredentialException {
		if (railway.getStartime().after(railway.getEndtime())) {
			throw new InvalidCredentialException("Start time must before end time");
		}
		return railRepo.save(railway);
	}

	@Override
	public List<Railway> displayAll() {
		return railRepo.findAll();
	}

	@Override
	public String deleteRailById(Long id) {
		if (railRepo.existsById(id)) {
			railRepo.deleteById(id);
			return "Deleted successfull";
		}
		return "deleting category details failed..";

	}

	@Override
	public Railway getRailById(Long id) {
		return railRepo.findById(id).get();
	}

	@Override
	public List<Railway> findAllByOrderByNameAsc() {

		return railRepo.findAllByOrderByNameAsc();
	}

	@Override
	public List<Railway> searchByCategory(Category category) {

		return railRepo.findAllByCategory(category);
	}

	@Override
	public List<Railway> searchByName(String name) {
		return railRepo.findAllByName(name);
	}

	@Override
	public List<RailwayDto> getAllDto() {

		return railRepo.findAll().stream().map(railway -> mapper.map(railway, RailwayDto.class))
				.collect(Collectors.toList());
	}

	@Override
	public boolean updateDetails(Railway railway) {
		Railway railway2 = railRepo.findById(railway.getId()).get();
		
		if(railway2!= null)
		{
			railRepo.save(railway);
			return true;
		}
		return false;
	}

}
