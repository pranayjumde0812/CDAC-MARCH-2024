package com.vehicle;

import java.util.*;

import com.enum_classes.Color;

public class Vehicle {
	private String chasisNumber;
	private double price;
	private Date manufactiringDate;
	private Date insuranceExpDate;
	private double pollutionLevel;
	private Color color;

	public Vehicle(String chasisNumber, double price, Date manufactiringDate, Date insuranceExpDate,
			double pollutionLevel, Color color) {
		this.chasisNumber = chasisNumber;
		this.price = price;
		this.manufactiringDate = manufactiringDate;
		this.insuranceExpDate = insuranceExpDate;
		this.pollutionLevel = pollutionLevel;
		this.color = color;
	}

	public Vehicle() {
		
	}

	public String getChasisNumber() {
		return chasisNumber;
	}

	public void setChasisNumber(String chasisNumber) {
		this.chasisNumber = chasisNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getManufactiringDate() {
		return manufactiringDate;
	}

	public void setManufactiringDate(Date manufactiringDate) {
		this.manufactiringDate = manufactiringDate;
	}

	public Date getInsuranceExpDate() {
		return insuranceExpDate;
	}

	public void setInsuranceExpDate(Date insuranceExpDate) {
		this.insuranceExpDate = insuranceExpDate;
	}

	public double getPollutionLevel() {
		return pollutionLevel;
	}

	public void setPollutionLevel(double pollutionLevel) {
		this.pollutionLevel = pollutionLevel;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehicle [chasisNumber=" + chasisNumber + ", price=" + price + ", manufactiringDate=" + manufactiringDate
				+ ", insuranceExpDate=" + insuranceExpDate + ", pollutionLevel=" + pollutionLevel + ", color=" + color
				+ "]";
	}

}
