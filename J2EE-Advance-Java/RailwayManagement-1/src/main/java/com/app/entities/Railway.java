package com.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.Past;

//import org.aspectj.lang.annotation.After;

@Entity
@Table(name = "myrailway")
public class Railway {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String name;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Category category;

	@Column(nullable = false)
	// @Past(message="abc")
	private Date startime;

	@Column(nullable = false)
	// @Past(message="tyu")
	// @After(value = "startime")
	private Date endtime;

	@Column(nullable = false)
	private String source;

	@Column(nullable = false)
	private String destination;

	@Column(nullable = false)
	private int stationcode;

	@Column(nullable = false)
	private int distance;

	@Column(nullable = false)
	private int frequency;

	public Railway() {
	}

	public Railway(Long id, String name, Category category, Date startime, Date endtime, String source,
			String destination, int stationcode, int distance, int frequency) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.startime = startime;
		this.endtime = endtime;
		this.source = source;
		this.destination = destination;
		this.stationcode = stationcode;
		this.distance = distance;
		this.frequency = frequency;
	}

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

	public Date getStartime() {
		return startime;
	}

	public void setStartime(Date startime) {
		this.startime = startime;
	}

	public Date getEndtime() {
		return endtime;
	}

	public void setEndtime(Date endtime) {
		this.endtime = endtime;
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

	public int getStationcode() {
		return stationcode;
	}

	public void setStationcode(int stationcode) {
		this.stationcode = stationcode;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
}