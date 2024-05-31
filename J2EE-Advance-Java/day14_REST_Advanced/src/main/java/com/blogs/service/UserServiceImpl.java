package com.blogs.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blogs.custom_exceptions.InvalidCredentialsException;
import com.blogs.dto.AuthDTO;
import com.blogs.dto.UserResponseDTO;
import com.blogs.entities.User;
import com.blogs.repository.UserRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public /* User */ UserResponseDTO login(AuthDTO authDTO) {

		User user = userRepository.findByEmailAndPassword(authDTO.getEmail(), authDTO.getPassword())
				.orElseThrow(() -> new InvalidCredentialsException("Invalid Credentials Please check again"));

		return modelMapper.map(user, UserResponseDTO.class);
	}

}
