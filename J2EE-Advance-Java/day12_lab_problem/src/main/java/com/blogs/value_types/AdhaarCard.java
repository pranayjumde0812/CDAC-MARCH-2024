package com.blogs.value_types;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AdhaarCard {
	@Column(name = "card_no", length = 14, unique = true)
	private String cardNumber;
	@Column(name = "created_on")
	private LocalDate createdOn;
	@Column(length = 30)
	private String location;

	public AdhaarCard() {
		// TODO Auto-generated constructor stub
	}

	public AdhaarCard(String cardNumber, LocalDate createdOn, String location) {
		super();
		this.cardNumber = cardNumber;
		this.createdOn = createdOn;
		this.location = location;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "AdhaarCard [cardNumber=" + cardNumber + ", createdOn=" + createdOn + ", location=" + location + "]";
	}

}
