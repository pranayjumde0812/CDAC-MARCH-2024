package com.app.banking;
/*
 * state - account no , customer name(first name last name), 
 * account type , customer dob , a/c creation date , balance

 */

import java.time.LocalDate;

import com.app.custom_exceptions.BankingException;

import static com.app.utils.BankingValidations.validateBalance;

public class BankAccount {
//tight encapsulation
	private int acctNo;
	private String firstName;
	private String lastName;
	private AcType acType;
	private LocalDate dob;
	private LocalDate creationDate;
	private double balance;

	public BankAccount(int acctNo, String firstName, String lastName, AcType acType, LocalDate dob,
			LocalDate creationDate, double balance) {
		super();
		this.acctNo = acctNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.acType = acType;
		this.dob = dob;
		this.creationDate = creationDate;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "BankAccount [acctNo=" + acctNo + ", firstName=" + firstName + ", lastName=" + lastName + ", acType="
				+ acType + ", dob=" + dob + ", creationDate=" + creationDate + ", balance=" + balance + "]";
	}

	// add Business logic methods --for withdraw , deposit n fund transfer
	// deposit method
	public double deposit(double amount) {
		this.balance += amount;
		return balance;
	}

	// withdraw funds
	public double withdraw(double amount) throws BankingException {
		// validateBalance
		validateBalance(balance - amount);
		this.balance -= amount;
		return balance;
	}

	// transfer funds
	public void transferFunds(BankAccount destination, double amount) throws BankingException {
		this.withdraw(amount);
		// => withdrawn : successfully
		destination.deposit(amount);
	}

}
