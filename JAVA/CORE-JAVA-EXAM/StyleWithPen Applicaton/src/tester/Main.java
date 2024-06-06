package tester;

import pojo.Pen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static utils.PenUtils.*;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Map<Integer, Pen> penMap = new HashMap<>();

            int choice;
            do {
                System.out.println("1. Add new pen " +
                        "\n2. Update Stock of pen " +
                        "\n3. Set discount of 20% for all the pens which are not at all sold in last 3 months" +
                        "\n4. Remove Pens which are never sold once listed in 9 months" +
                        "\n5. Display all pens");
                choice = sc.nextInt();

                try {
                    switch (choice) {
                        case 1:
                            addNewPen(sc, penMap);
                            System.out.println("Added Successfully");
                            break;
                        case 2:
                            String message = updateStock(sc, penMap);
                            System.out.println(message);
                            break;
                        case 3:
                            set20PercentDiscount(penMap);
                            break;
                        case 4:
                            deleteNotSoledPenIn9Months(penMap);
                            break;
                        case 5:
                            for (Pen pen : penMap.values()) {
                                System.out.println(pen);
                            }
                            break;
                        case 0:
                            System.out.println("Exiting.....");
                            break;
                        default:
                            System.out.println("Invalid Input...");
                            break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    sc.nextLine();
                }
            } while (choice != 0);
        }
    }
}

//1.
//A company StyleWithPen sells stylish Pens online.
//Company needs an interface for site admin to manage stocks.
//
//Write a console-based menu driven java program for site ADMIN to perform following operations:
//
//        1. Add new Pen
//2. Update stock of a Pen
//3. Set discount of 20% for all the pens which are not at all sold in last 3 months
//4. Remove Pens which are never sold once listed in 9 months
//
//You can define a class Pen with the following fields –
//        a.	ID (unique identifier for each Pen, should be generated automatically)
//b.	Brand (Example:  Cello, Parker, Reynolds etc.)
//c.	Color
//d.	InkColor
//e.	Material (Example: Plastic, Alloy Steel, Metal etc.)
//f.	Stock (Available quantity)
//g.	Stock Update Date (it changed every time when admin update stock or user order executed)
//h.	Stock Listing Date (date on which product is added to site for sale)
//i.	Price (in INR)
//j.	Discounts (in percentage)
//
//Note: You can use java collection to store items in memory.

//cello red blue plastic 20 2023-05-22 2023-05-22 30 5