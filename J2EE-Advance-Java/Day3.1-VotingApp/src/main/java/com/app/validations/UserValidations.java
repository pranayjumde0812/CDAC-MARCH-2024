package com.app.validations;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;

import com.app.exception.InvalidDateException;

public class UserValidations {

	public static Date validateDate(Date date) throws InvalidDateException {

		LocalDate dob = date.toLocalDate();

		Period difference = Period.between(dob, LocalDate.now());

		if (difference.getYears() >= 18)
			return date;

		throw new InvalidDateException("Voter is not 18 years or above old");
	}
}
