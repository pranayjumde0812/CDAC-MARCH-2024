package com.utility_classes;

import static com.validation.ValidationRules.checkpollutionLevel;

import java.util.Date;
import java.util.Scanner;

import com.custom_exception.ColorNotFoundException;
import com.custom_exception.PollutionLevelExceededException;
import com.enum_classes.Color;
import com.validation.ValidationRules;
import com.vehicle.Vehicle;

public class VehicleUtility {

	public static void acceptVehicleDetails(Vehicle[] vehicle) throws ColorNotFoundException {
		try (Scanner sc = new Scanner(System.in)) {
			for (int i = 0; i < vehicle.length; i++) {

				System.out.println("Enter Chasis number ");
				String chasisNum = sc.next();
				System.out.println("Enter Price ");
				double price = sc.nextDouble();
				System.out.println("Enter manufacturing date");
				Date mandate = new Date();
				System.out.println("date ");
				mandate.setDate(sc.nextInt());
				System.out.println("month");
				mandate.setMonth(sc.nextInt());
				System.out.println("year");
				mandate.setYear(sc.nextInt());
				System.out.println("Enter Insurance Exp date");
				Date insExpDate = new Date();
				System.out.println("date ");
				insExpDate.setDate(sc.nextInt());
				System.out.println("month");
				insExpDate.setMonth(sc.nextInt());
				System.out.println("year");
				insExpDate.setYear(sc.nextInt());

				System.out.println("Enter Pollution level");
				double pollutionLevel = sc.nextDouble();
				checkpollutionLevel(pollutionLevel);
				System.out.println("Enter Color ");
				String color = sc.next();
				Color col = ValidationRules.findByName(color);
				if (col == null) {
					throw new ColorNotFoundException("Color is not present in the list");
				}

				vehicle[i] = new Vehicle(chasisNum, price, mandate, insExpDate, pollutionLevel, col);
			}

		} catch (PollutionLevelExceededException ex) {
			ex.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
	}

	public static void displayVehicleDetails(Vehicle[] vehicle) {
		for (Vehicle v : vehicle) {
			System.out.println(v);
		}
	}
}
