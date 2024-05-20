package com.app.entity;

public class Patient {

	private int patientId;
	private String patientName;
	private String email;
	private String password;

	public Patient() {

	}

	public Patient(int patientId, String patientName, String email, String password) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.email = email;
		this.password = password;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", email=" + email + ", password="
				+ password + "]";
	}
	
	

}
