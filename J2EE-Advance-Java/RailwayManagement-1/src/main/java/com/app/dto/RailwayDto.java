package com.app.dto;

import java.util.Date;

import com.app.entities.Category;

public class RailwayDto {
	
	//Name, Category, Start_time, End_time, Fee
	
	public String name;
	public Category category;
	public Date startime;
	public Date endtime;
	
	
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
	
	@Override
	public String toString() {
		return "RailwayDto [name=" + name + ", category=" + category + ", startime=" + startime + ", endtime=" + endtime
				+ "]";
	}
	
	
	
	
	
	
	

}
