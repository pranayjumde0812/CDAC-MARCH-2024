//  String name,int age,String email_id,String Phone,int rating
//
// This application should contains the test class called CricketerTest which will
// test the functionality of pojo.Cricketer class.
//
// Use any collection you like to store the data.
//
// 1.Accept minimum 5 Cricketers in the collection.
//
// 2.Modify Cricketer's rating
//
// 3.Search Cricketer by name
//
// 4.Display all Cricketers added in collection.
//
// 5.Display All Cricketers in sorted form by rating.


import pojo.Cricketer;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import static utils.CricketerUtils.*;

public class CricketerTest {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            List<Cricketer> cricketers = populatedlist();
            int choice;
            do {
                System.out.println("1. Add cricketer\n2. Modify Cricketer rating" +
                        "\n3. Search Cricketer by Name\n4. Display All cricketers" +
                        "\n5. Display Sorted cricketers by rating \n0. Exit");
                choice = sc.nextInt();
                try {
                    switch (choice) {
                        case 1:
                            addCricketer(cricketers, sc);
                            break;
                        case 2:
                            modifyCricketerRating(cricketers, sc);
                            break;
                        case 3:
                            System.out.println("Enter name : ");
                            Cricketer cricketer = searchCricketerByName(cricketers, sc.next());
                            if (cricketer != null) {
                                System.out.println(cricketer);
                            } else {
                                System.out.println("Cricketer not found!!!");
                            }
                            break;
                        case 4:
                            displayAllCricketers(cricketers);
                            break;
                        case 5:
                            cricketers.sort(Comparator.comparing(Cricketer::getRating));
//                            cricketers.sort(Comparator.comparing(Cricketer::getRating).thenComparing(Cricketer::getAge));
//                            displayAllCricketers(cricketers);
                            break;
                        case 0:
                            System.out.println("Exiting...");
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