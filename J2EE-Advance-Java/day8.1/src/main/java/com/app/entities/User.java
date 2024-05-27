package com.app.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

//column - id , first name , last name, email ,password ,
//dob , phone no , role
@Entity // class level , run time anno for hibernate to manage the entities(i.e life
		// cycle) : mandatory
@Table(name = "users") // for specifying table name
public class User {
	// ID property in hibernate managed entities MUST be Serializable
	// till Hibernate 5.
	@Id // mandatory => PK constraint
	// for automatic id generation by hibernate(JPA)
	// strategy = GenerationType.IDENTITY =>
	// most suitable for MySql => auto increment
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 20, name = "first_name") // first_name : varchar(20)
	private String firstName;
	@Column(length = 20, name = "last_name") // last_name : varchar(20)
	private String lastName;
	@Column(length = 30, unique = true) // unique constraint
	private String email;
	@Column(length = 20, nullable = false) // not null constraint
	private String password;
	private LocalDate dob;
	@Column(name = "phone_no", length = 14, unique = true)
	private String phoneNo;
	@Enumerated(EnumType.STRING) // col type : varchar(20 : store enum constant names
	@Column(length = 20)
	private Role role;
	@Column(name = "reg_amount")
	private double regAmount;
	@CreationTimestamp // imported from hibernate ,
	// will generate auto the curnt date when new entity is created
	@Column(name = "reg_Date")
	private LocalDate regDate;
	// add a property to store the bin contents in DB
	@Lob // large object
	private byte[] image; // col type : long blob
	@UpdateTimestamp // col type : datetime , hib will auto update it's value when the entity is
						// updated
	private LocalDateTime updated;

//def ctor 
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String firstName, String lastName, String email, String password, LocalDate dob, String phoneNo,
			Role role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.phoneNo = phoneNo;
		this.role = role;
	}

	public User(String firstName, String lastName, String email, String password, LocalDate dob, String phoneNo,
			Role role, double regAmount) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.phoneNo = phoneNo;
		this.role = role;
		this.regAmount = regAmount;
	}

	public User(String firstName, LocalDate dob, String phoneNo) {
		super();
		this.firstName = firstName;
		this.dob = dob;
		this.phoneNo = phoneNo;
	}

	// getters n setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public double getRegAmount() {
		return regAmount;
	}

	public void setRegAmount(double regAmount) {
		this.regAmount = regAmount;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public LocalDateTime getUpdated() {
		return updated;
	}

	public void setUpdated(LocalDateTime updated) {
		this.updated = updated;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", dob="
				+ dob + ", phoneNo=" + phoneNo + ", role=" + role + ", regAmount=" + regAmount + ", regDate=" + regDate
				+ "]";
	}

}
