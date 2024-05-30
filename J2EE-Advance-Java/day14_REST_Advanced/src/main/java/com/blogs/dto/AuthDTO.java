package com.blogs.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class AuthDTO {

	private String email;
	private String password;
}
