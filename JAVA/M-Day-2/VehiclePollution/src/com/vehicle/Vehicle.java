package com.vehicle;

import java.time.LocalDate;

public class Vehicle {

	private String chasisNumber;
	private double price;
	private LocalDate manufacturingDate;
	private LocalDate insuranceExpiryDate;
	private double pollutionLevel;
	private Color color;

	public Vehicle() {
		super();
	}

	public Vehicle(String chasisNumber, double price, LocalDate manufacturingDate, LocalDate insuranceExpiryDate,
			double pollutionLevel, Color color) {
		super();
		this.chasisNumber = chasisNumber;
		this.price = price;
		this.manufacturingDate = manufacturingDate;
		this.insuranceExpiryDate = insuranceExpiryDate;
		this.pollutionLevel = pollutionLevel;
		this.color = color;
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

	public LocalDate getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(LocalDate manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}

	public LocalDate getInsuranceExpiryDate() {
		return insuranceExpiryDate;
	}

	public void setInsuranceExpiryDate(LocalDate insuranceExpiryDate) {
		this.insuranceExpiryDate = insuranceExpiryDate;
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
		return "chasisNumber=" + chasisNumber + ", price=" + price + ", manufacturingDate=" + manufacturingDate
				+ ", insuranceExpiryDate=" + insuranceExpiryDate + ", pollutionLevel=" + pollutionLevel + ", color="
				+ color;
	}

}
