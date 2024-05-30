package com.blogs.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.blogs.value_types.AdhaarCard;

@Entity
@Table(name = "users") // for specifying table name
public class User extends BaseEntity {
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
	// add a property to store the bin contents in DB
	@Lob // large object
	private byte[] image; // col type : long blob
	// User 1---->1 Address -uni dir one to one asso between entities
	@OneToOne(cascade =CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "address_id")
	private Address myAddress;
	//add one one mapping between Entity n comopiste value type
	//eg : User HAS-A AdhaarCard
	@Embedded //optional BUT reco for understanding
	private AdhaarCard card;
	//Can one user know multiple languages ? YES
	//one -many , Entity 1--->* Value type
	@ElementCollection //mandatory
	@CollectionTable(name = "user_langs",
	joinColumns = @JoinColumn(name="user_id"))
	@Column(name="language",length = 30)
	private List<String> languages=new ArrayList<>();

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
	

	public User(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Address getMyAddress() {
		return myAddress;
	}

	public void setMyAddress(Address myAddress) {
		this.myAddress = myAddress;
	}
	

	public AdhaarCard getCard() {
		return card;
	}

	public void setCard(AdhaarCard card) {
		this.card = card;
	}
	

	public List<String> getLanguages() {
		return languages;
	}

	public void setLanguages(List<String> languages) {
		this.languages = languages;
	}

	@Override
	public String toString() {
		return "User [id=" + getId() + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", dob=" + dob + ", phoneNo=" + phoneNo + ", role=" + role + ", regAmount=" + regAmount + ", regDate="
				+ getCreationDate() + "]";
	}

}
