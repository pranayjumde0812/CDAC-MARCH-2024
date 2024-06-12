package com.tester;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.entities.Flight;
import static com.utils.FlightUtils.*;

public class FlightManagementSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			Map<String, Flight> flightMap = new HashMap<>();
			int choice;
			do {
				System.out.println(
						"1.Add new flight\n2.Display all flights\n3.Display flight names,date, dep time, arrival time from specified source city"
								+ "\n4.Sort flight as per flight date\n5.Change destination of flight which have source city pune\n6.Remove flight based on flight number"
								+ "\n7.Exit");
				choice = sc.nextInt();
				try {
					switch (choice) {
					case 1:
						addNewFlight(sc, flightMap);
						break;
					case 2:
						displayAllFlights(flightMap);
						break;
					case 3:
						showFlightDetailsForSpecifiedSourceCity(sc, flightMap);
						break;
					case 4:
						flightMap.values().stream().sorted(Comparator.comparing(Flight::getFlightdate))
								.forEach(System.out::println);
						break;
					case 5:
						changeDestination(sc, flightMap);
						break;
					case 6:
						removeFlightBasedOnFlightNumber(sc, flightMap);
						break;
					case 7:
						System.out.println("Exiting...");
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					sc.nextLine();
				}

			} while (choice != 7);

		}
	}
}
