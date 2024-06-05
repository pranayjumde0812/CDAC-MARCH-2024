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

//cello red blue plastic 20 2022-12-22 2022-12-22 30 5