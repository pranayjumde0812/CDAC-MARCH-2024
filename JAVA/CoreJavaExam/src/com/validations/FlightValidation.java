package com.validations;

import java.time.LocalDate;

import com.entities.Flight;
import com.entities.FlightType;
import com.exceptions.IlligaldateException;
import com.exceptions.InvalidFlightNumberException;
import com.exceptions.InvalidFlightTypeException;

public class FlightValidation {
//	flightNum,flightName,depTime,arrivaltime,source,date,destination,numOfSeats,fare,status,type

	public static Flight validateAllInputs(String flightNumber, String flightName, String deptTime, String arrivalTime,
			String source, LocalDate date, String destination, int noOfSeat, int fare, String type)
			throws IlligaldateException, InvalidFlightNumberException, InvalidFlightTypeException {

		
		validateFlightnumber(flightNumber);
		LocalDate validateDate = validateDate(date);
		FlightType validateType = validateType(type);

		Flight flight = new Flight(flightNumber, flightName, deptTime, arrivalTime, source, validateDate, destination,
				noOfSeat, fare, validateType);

		return flight;
	}

	private static FlightType validateType(String type) throws InvalidFlightTypeException {

		for (FlightType ft : FlightType.values()) {
			if (ft.name().equalsIgnoreCase(type)) {
				return ft;
			}
		}

		throw new InvalidFlightTypeException("Invalid Flight type");

	}

	private static void validateFlightnumber(String flightNumber) throws InvalidFlightNumberException {

		if (flightNumber.length() != 6) {
			throw new InvalidFlightNumberException("Invalid Flight Number");
		}

	}

	private static LocalDate validateDate(LocalDate date) throws IlligaldateException {

		if (date.isBefore(LocalDate.now())) {
			throw new IlligaldateException("Date is before the todays date");
		}

		return date;
	}
}
