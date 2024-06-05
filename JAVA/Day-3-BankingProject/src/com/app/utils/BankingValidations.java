package com.app.utils;

import java.time.LocalDate;

import com.app.banking.AcType;
import com.app.banking.BankAccount;
import com.app.custom_exceptions.BankingException;

public class BankingValidations {
	public static final double MIN_BALANCE;
	static {
		MIN_BALANCE = 5000;
	}

//add public static method to validate for min bal
	public static void validateBalance(double balance) throws BankingException {
		if (balance < MIN_BALANCE)
			throw new BankingException("Insufficient Balance !!!!!");
		System.out.println("valid balance....");
	}

// Method for validating and parsing the data members
	public static BankAccount validateAllInputs(int accNum, String fName, String lName, String acType, String dob,
			String creationDate, double initialBalance) throws BankingException {

		AcType accType = AcType.valueOf(acType);
		LocalDate dateOfBirth = LocalDate.parse(dob);
		LocalDate accOpenDate = LocalDate.parse(creationDate);

		validateBalance(initialBalance);
		return new BankAccount(accNum, fName, lName, accType, dateOfBirth, accOpenDate, initialBalance);
	}
}
