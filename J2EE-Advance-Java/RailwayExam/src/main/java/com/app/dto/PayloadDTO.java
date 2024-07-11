package com.app.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.NotBlank;

import com.app.model.Category;

import lombok.Data;

@Data
public class PayloadDTO {

	@NotBlank
	private String name;

	@NotBlank
	private Category category;

	@NotBlank
	private LocalDateTime startTime;

	@NotBlank
	private LocalDateTime endTime;
}
