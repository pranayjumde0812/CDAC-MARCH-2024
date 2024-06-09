package com.app.entity;

import java.time.LocalDate;

public class FullTimeEmp extends Employee{
	
	private double hoursal;
		

	public FullTimeEmp(String name, LocalDate doj, String phoneno, String aadhaarno, double hoursal) {
		super(name, doj, phoneno, aadhaarno);
		this.hoursal = hoursal;
	}

	public double getHoursal() {
		return hoursal;
	}

	public void setHoursal(double hoursal) {
		this.hoursal = hoursal;
	}

	@Override
	public String toString() {
		return "FullTimeEmp [" + super.toString() + ", hoursal=" + hoursal + "]";
	}

	
	
	
	
	

}
