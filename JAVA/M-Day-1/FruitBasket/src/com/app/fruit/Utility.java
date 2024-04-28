package com.app.fruit;

import java.util.Scanner;

public class Utility {

	public static void addFruits(Fruit[] fruits, int choice, int index) {
		Scanner sc = new Scanner(System.in);
		String name;
		String color;
		double weight;
		switch (choice) {
		case 1:
			System.out.println("Enter name of fruit : ");
			name = sc.next();
			System.out.println("Enter color :  ");
			color = sc.next();
			System.out.println("Enter weight : ");
			weight = sc.nextDouble();
			fruits[index] = new Mango(name, color, weight);
			break;
		case 2:
			System.out.println("Enter name of fruit : ");
			name = sc.next();
			System.out.println("Enter color :  ");
			color = sc.next();
			System.out.println("Enter weight : ");
			weight = sc.nextDouble();
			fruits[index] = new Orange(name, color, weight);
			break;
		case 3:
			System.out.println("Enter name of fruit : ");
			name = sc.next();
			System.out.println("Enter color :  ");
			color = sc.next();
			System.out.println("Enter weight : ");
			weight = sc.nextDouble();
			fruits[index] = new Apple(name, color, weight);
			break;
		}
	}

	public static void displayNameOfFruits(Fruit[] fruits) {
		for (Fruit f : fruits) {
			System.out.println(f.getName());
		}
	}

	public static void displayFreshFruits(Fruit[] fruits) {
		for (Fruit f : fruits) {
			if (f.isFresh()) {
				System.out.println(f + " and taste is " + f.taste());
			}
		}
	}

	public static void markFruitAsStale(Fruit[] fruits, int index) {
		if (index > fruits.length - 1) {
			System.out.println("Invalid index");
		} else {
			fruits[index].setFresh(false);
		}
	}

	public static void markAllSourFruitsStale(Fruit[] fruits) {

		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i].taste().equalsIgnoreCase("sour")) {
				fruits[i].setFresh(false);
			}
		}
	}

	public static void showFruitSpecificFunctionality(Fruit[] fruits) {
		for (Fruit f : fruits) {
			if (f instanceof Mango) {
				Mango m = (Mango) f;
				m.pulp();
			}

			if (f instanceof Apple) {
				Apple a = (Apple) f;
				a.jam();
			}

			if (f instanceof Orange) {
				Orange o = (Orange) f;
				o.juice();
			}
		}
	}
}
