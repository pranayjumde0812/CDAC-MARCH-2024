package com.blogs.service;

import com.blogs.dto.AuthDTO;
import com.blogs.dto.UserResponseDTO;

public interface UserService {

	/* User */ UserResponseDTO  login(AuthDTO authDTO);
}
