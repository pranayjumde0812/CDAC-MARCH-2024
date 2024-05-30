package com.blogs.service;

import com.blogs.dto.AuthDTO;
import com.blogs.entities.User;

public interface UserService {

	User /* UserResponseDTO */ login(AuthDTO authDTO);
}
