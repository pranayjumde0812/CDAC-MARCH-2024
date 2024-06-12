package com.utils;

import java.time.LocalDate;
import java.util.Map;
import java.util.Scanner;

import com.entities.Flight;
import com.exceptions.IlligaldateException;
import com.exceptions.InvalidCityNameException;
import com.exceptions.InvalidFlightNumberException;
import com.exceptions.InvalidFlightTypeException;

import static com.validations.FlightValidation.*;

public class FlightUtils {

	public static void addNewFlight(Scanner sc, Map<String, Flight> flightMap)
			throws IlligaldateException, InvalidFlightNumberException, InvalidFlightTypeException {
		System.out.println("Enter Flight number : ");
		String flightNum = sc.next();
		System.out.println("Enter Flight name : ");
		String flightName = sc.next();
		System.out.println("Enter Flight departure time : ");
		String depTime = sc.next();
		System.out.println("Enter Flight arrival time : ");
		String arrivaltime = sc.next();
		System.out.println("Enter Source city : ");
		String source = sc.next();
		System.out.println("Enter Flight date(yyyy-MM-dd) : ");
		LocalDate date = LocalDate.parse(sc.next());
		System.out.println("Enter destination : ");
		String destination = sc.next();
		System.out.println("Enter Number of seats : ");
		int numOfSeats = sc.nextInt();
		System.out.println("Enter fare : ");
		int fare = sc.nextInt();
		System.out.println("Enter Type : ");
		String type = sc.next();

		Flight validateFlight = validateAllInputs(flightNum, flightName, depTime, arrivaltime, source, date,
				destination, numOfSeats, fare, type);

		flightMap.put(validateFlight.getFlightNumber(), validateFlight);

	}

	public static void displayAllFlights(Map<String, Flight> flightMap) {

		for (Flight flight : flightMap.values()) {
			System.out.println(flight);
		}
	}

	public static void showFlightDetailsForSpecifiedSourceCity(Scanner sc, Map<String, Flight> flightMap)
			throws InvalidCityNameException {
		System.out.println("Enter Source City");
		String sourceCity = sc.next();

		for (Flight flight : flightMap.values()) {
			if (flight.getSource().equalsIgnoreCase(sourceCity)) {
				System.out.println("Flight Name : " + flight.getFlightName() + ", Flight date : "
						+ flight.getFlightdate() + ", Depature Time : " + flight.getDepartureTime()
						+ ", Arrival time : " + flight.getArrivalTime() + ", Source " + sourceCity);

			}
		}
	}

	public static void changeDestination(Scanner sc, Map<String, Flight> flightMap) {
		System.out.println("Enter new Destination city");
		String destination = sc.next();
		for (Flight flight : flightMap.values()) {
			if (flight.getSource().equalsIgnoreCase("PUNE")) {
				flight.setDestination(destination);
			}
		}
	}

	public static void removeFlightBasedOnFlightNumber(Scanner sc, Map<String, Flight> flightMap)
			throws InvalidFlightNumberException {

		System.out.println("Enter Flight number : ");
		String flightNum = sc.next();

		if (flightMap.containsKey(flightNum)) {
			flightMap.remove(flightNum);
		} else
			throw new InvalidFlightNumberException("Flight number does not exist");

	}
}
