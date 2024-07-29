 package com.app.model;

import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Railway {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	private String name;

	@Enumerated(EnumType.STRING)
	@NotNull
	private Category category;

	@NotNull
	private LocalDateTime startTime;

	@NotNull
	private LocalDateTime endTime;

	@NotBlank
	private String source;

	@NotBlank
	private String destination;

	@NotBlank
	private String stationCode;

	@NotNull
	private Double distance;

	@NotBlank
	private String frequency;

	@NotNull
	private Double fee;

//	@PrePersist
//	@PreUpdate
//	private void validateTimes() {
//		if (startTime.isAfter(endTime)) {
//			throw new IllegalArgumentException("Start time cannot be after end time");
//		}
//	}

}
