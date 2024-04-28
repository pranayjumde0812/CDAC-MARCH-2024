package com.app.fruit;

import java.util.Scanner;
import static com.app.fruit.Utility.*;

public class Tester {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of fruit basket");
		Fruit[] fruits = new Fruit[sc.nextInt()];
		int choice;
		int index = 0;
		do {
			System.out.println("---------------------------------------------------------------------------");
			System.out.println("Enter choice :-->");
			System.out.println("1.Add Mango | 2.Add Orange | 3.Add Apple | 4.Display Name Of all Fruits ");
			System.out.println("5.Display Name, color, Weigth and taste of all fresh fruits in basket ");
			System.out.println("6.Mark a fruit in a basket , as stale(=not fresh) ");
			System.out.println("7.Mark all sour fruits stale(=not fresh)");
			System.out.println("8.Invoke fruit specific functionality (pulp / juice / jam)");
			System.out.println("9.Exit...");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				addFruits(fruits, choice, index);
				index++;
				break;
			case 2:
				addFruits(fruits, choice, index);
				index++;
				break;
			case 3:
				addFruits(fruits, choice, index);
				index++;
				break;
			case 4:
				displayNameOfFruits(fruits);
				break;
			case 5:
				displayFreshFruits(fruits);
				break;
			case 6:
				System.out.println("Enter the index : ");
				markFruitAsStale(fruits, sc.nextInt() - 1);
				break;
			case 7:
				markAllSourFruitsStale(fruits);
				break;
			case 8:
				showFruitSpecificFunctionality(fruits);
				break;
			case 9:
				System.out.println("Exiting.....");
				break;
			default:
				System.out.println("Invalid Choice...");
				break;
			}
		} while (choice != 9);

	}
}
