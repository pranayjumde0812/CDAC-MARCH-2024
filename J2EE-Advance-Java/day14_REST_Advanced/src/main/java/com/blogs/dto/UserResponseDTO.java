package com.blogs.dto;

import java.time.LocalDate;
import com.blogs.entities.Role;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserResponseDTO extends BaseDTO {

	private String firstName;

	private String lastName;

	private String email;

	private LocalDate dob;

	private String phoneNo;

	private Role role;

}
