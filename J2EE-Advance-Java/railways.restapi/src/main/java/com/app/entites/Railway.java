package com.app.entites;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "railways")
@Data
public class Railway {

	@Id
	@GeneratedValue
	private int Id;
	@Column(nullable = false, length = 20)
	private String name;
	@Column(nullable = false, length = 10)
	@Enumerated(EnumType.STRING)
	private Category category;
	@Column(nullable = false)
	//@PastOrPresent
	private LocalDateTime start_time;
	@Column(nullable = false)
	//@FutureOrPresent
	private LocalDateTime end_time;
	@Column(nullable = false, length = 10)
	private String source;
	@Column(nullable = false, length = 10)
	private String destination;
	@Column(nullable = false, length = 5)
	private String station_code;
	@Column(nullable = false)
	private int distance;
	@Column(nullable = false)
	private double frequency;

	public Railway() {
	}

	public Railway(String name, Category category, LocalDateTime start_time, LocalDateTime end_time, String source,
			String destination, String station_code, int distance, double frequency) {
		super();
		this.name = name;
		this.category = category;
		this.start_time = start_time;
		this.end_time = end_time;
		this.source = source;
		this.destination = destination;
		this.station_code = station_code;
		this.distance = distance;
		this.frequency = frequency;
	}

	public int getId() {
		return Id;
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

	public LocalDateTime getStart_time() {
		return start_time;
	}

	public void setStart_time(LocalDateTime start_time) {
		this.start_time = start_time;
	}

	public LocalDateTime getEnd_time() {
		return end_time;
	}

	public void setEnd_time(LocalDateTime end_time) {
		this.end_time = end_time;
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

	public String getStation_code() {
		return station_code;
	}

	public void setStation_code(String station_code) {
		this.station_code = station_code;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public double getFrequency() {
		return frequency;
	}

	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return "Railway [Id=" + Id + ", name=" + name + ", category=" + category + ", start_time=" + start_time
				+ ", end_time=" + end_time + ", source=" + source + ", destination=" + destination + ", station_code="
				+ station_code + ", distance=" + distance + ", frequency=" + frequency + "]";
	}

}
