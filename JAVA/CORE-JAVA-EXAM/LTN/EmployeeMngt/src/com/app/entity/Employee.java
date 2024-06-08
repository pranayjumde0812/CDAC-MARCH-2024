package com.app.entity;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {

	private int id;
	private String name;
	private LocalDate doj;
	private String phoneno;
	private String aadhaarno;
	private static int autoid=1;
	
	
	
	public Employee(String name, LocalDate doj, String phoneno, String aadhaarno) {
		super();
		this.name = name;
		this.doj = doj;
		this.phoneno = phoneno;
		this.aadhaarno = aadhaarno;
		this.id = autoid++;
	}
	
	public Employee(int id) {
		this.id = id;
	}
	
	public Employee(String aadhaarno) {
		this.aadhaarno = aadhaarno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getAadhaarno() {
		return aadhaarno;
	}
	public void setAadhaarno(String aadhaarno) {
		this.aadhaarno = aadhaarno;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", doj=" + doj + ", phoneno=" + phoneno + ", aadhaarno="
				+ aadhaarno + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(aadhaarno, other.aadhaarno);
	}
	
	

	
	
	
	
	
	
}
