package com.blogs.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BaseDTO {
	// this is used during serialization.
	@JsonProperty(access = Access.READ_ONLY)
	private Long id;
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDate creationDate;
	@JsonProperty(access = Access.READ_ONLY)
	private LocalDate updatedOn;

}
