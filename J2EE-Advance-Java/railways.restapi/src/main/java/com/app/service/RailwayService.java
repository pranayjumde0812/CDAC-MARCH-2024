package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.entites.Category;
import com.app.entites.Railway;
import com.app.repo.RailwayRepository;

@Service
@Transactional
public class RailwayService implements IService {
	@Autowired
	public RailwayRepository railrepo;

	@Override
	public Railway addNewRailway(Railway rail) {
		return railrepo.save(rail);

	}

	@Override
	public void deleteRail(int id) {
		// TODO Auto-generated method stub
		railrepo.deleteById(id);
		System.out.println("Railway deleted by ID No.: " + id);
	}

	@Override
	public List<Railway> getByCat(Category cat) {
		// TODO Auto-generated method stub
		return railrepo.getListByCategory(cat);
	}

	@Override
	public Railway updateRailSrc(String src, int id) {

		Optional<Railway> r = railrepo.findById(id);
		Railway rail = new Railway();
		rail.setSource(src);
		// TODO Auto-generated method stub
		return rail;
	}

}
