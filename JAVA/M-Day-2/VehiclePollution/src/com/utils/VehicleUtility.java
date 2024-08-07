package com.utils;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.vehicle.Color;
import com.vehicle.Vehicle;

public class VehicleUtility {
	public static void addVehicledetails(List<Vehicle> vehiclesList) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Chasis Number : ");
		String chasisNum = sc.next();
		System.out.println("Enter Color : ");
		Color color = Color.valueOf(sc.next().toUpperCase());
		System.out.println("Enter Price : ");
		double price = sc.nextDouble();
		System.out.println("Enter Manufacturing Date (yyyy-MM-dd) : ");
		LocalDate manDate = LocalDate.parse(sc.next());
		System.out.println("Enter Insurance Expiry Date (yyyy-MM-dd) : ");
		LocalDate expDate = LocalDate.parse(sc.next());

		Vehicle vehicle = new Vehicle(chasisNum, price, manDate, expDate, price, color);

		vehiclesList.add(vehicle);
	}
}
