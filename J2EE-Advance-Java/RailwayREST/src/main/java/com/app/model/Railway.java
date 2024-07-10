package com.app.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Railway {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique=true)
	private Long id;
	private String name;
	@Enumerated(EnumType.STRING)
	private Category category;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime startTime;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private LocalDateTime endTime;
	private String source;
	private String destination;
	private String stationCode;
	private Double distance;
	private Double frequency;
	

	public Railway(String name, Category category, LocalDateTime startTime, LocalDateTime endTime, String source,
			String destination, String stationCode, double distance, double frequency) {
		super();
		this.name = name;
		this.category = category;
		this.startTime = startTime;
		this.endTime = endTime;
		this.source = source;
		this.destination = destination;
		this.stationCode = stationCode;
		this.distance = distance;
		this.frequency = frequency;
	}
	/*
	 * public Railway(Long id, String name, Category category, LocalDateTime
	 * startTime, LocalDateTime endTime, String source, String destination, String
	 * stationCode, int distance, int frequency) { super(); this.id = id; this.name
	 * = name; this.category = category; this.startTime = startTime; this.endTime =
	 * endTime; this.source = source; this.destination = destination;
	 * this.stationCode = stationCode; this.distance = distance; this.frequency =
	 * frequency; }
	 */

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public LocalDateTime getStartTime() {
		return startTime;
	}
	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}
	public LocalDateTime getEndTime() {
		return endTime;
	}
	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getstationCode() {
		return stationCode;
	}
	public void setstationCode(String stationCode) {
		this.stationCode = stationCode;
	}
	
	

	public String getStationCode() {
		return stationCode;
	}

	public void setStationCode(String stationCode) {
		this.stationCode = stationCode;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Double getFrequency() {
		return frequency;
	}

	public void setFrequency(Double frequency) {
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return "Railway [id=" + id + ", name=" + name + ", category=" + category + ", startTime=" + startTime
				+ ", endTime=" + endTime + ", source=" + source + ", destination=" + destination + ", stationCode="
				+ stationCode + ", distance=" + distance + ", frequency=" + frequency + "]";
	}
	
}
