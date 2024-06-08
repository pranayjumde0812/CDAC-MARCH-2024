package com.app.entity;

import java.time.LocalDate;

public class PartTimeEmp extends Employee{

	private double monthsal;
	
	public PartTimeEmp(String name, LocalDate doj, String phoneno, String aadhaarno, double monthsal) {
		super(name, doj, phoneno, aadhaarno);
		this.monthsal = monthsal;
		
	}

	public double getMonthsal() {
		return monthsal;
	}

	public void setMonthsal(double monthsal) {
		this.monthsal = monthsal;
	}

	@Override
	public String toString() {
		return "PartTimeEmp [" + super.toString()+ ", monthsal=" + monthsal + "]";
	}

	

	
	
	
	

}
