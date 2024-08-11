package com.app.service;

import javax.validation.ConstraintViolationException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.MethodArgumentNotValidException;

import com.app.custom_exceptions.ApiException;
import com.app.dto.Signup;
import com.app.entities.UserEntity;
import com.app.repository.UserEntityRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	//dep : dao layer i/f
		@Autowired
		private UserEntityRepository userDao;
		//dep
		@Autowired
		private ModelMapper mapper;
		//dep 
		@Autowired
		private PasswordEncoder encoder;
	@Override
	public Signup userRegistration(Signup reqDTO) {
		//dto --> entity
		UserEntity user=mapper.map(reqDTO, UserEntity.class);
		if(userDao.existsByEmail(reqDTO.getEmail()))
			throw new ApiException("Email already exists !!!");
		
		user.setPassword(encoder.encode(user.getPassword()));//pwd : encrypted using SHA
		return mapper.map(userDao.save(user), Signup.class);
	}

}
