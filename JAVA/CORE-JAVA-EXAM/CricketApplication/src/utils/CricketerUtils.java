package utils;

import pojo.Cricketer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CricketerUtils {


    public static List<Cricketer> populatedlist() {
        List<Cricketer> cricketers = new ArrayList<>();
        cricketers.add(new Cricketer("Pranay", 24, "pranay@gmail.com", "9657963378", 9));
        cricketers.add(new Cricketer("Anuj", 24, "anuj@gmail.com", "9844775566", 8));
        cricketers.add(new Cricketer("Vishal", 22, "vishal@gmail.com", "7744112255", 7));
        cricketers.add(new Cricketer("Rahul", 29, "rahul@gmail.com", "9467852133", 10));
        cricketers.add(new Cricketer("Pavan", 21, "pavan@gmail.com", "9994445214", 8));

        return cricketers;
    }

    public static void addCricketer(List<Cricketer> cricketerList, Scanner sc) {
        System.out.println("Enter Cricketer Details");
        System.out.println("Name, Age, Email, Phone Number, Rating");
        Cricketer cricketer = new Cricketer(sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.nextInt());
        cricketerList.add(cricketer);
    }

    public static void modifyCricketerRating(List<Cricketer> cricketerList, Scanner sc) {
        System.out.println("Enter Cricketer Name");
        String name = sc.next();

        Cricketer cricketer = searchCricketerByName(cricketerList, name);
        if (cricketer != null) {
            System.out.println("Enter new rating for " + name);
            cricketer.setRating(sc.nextInt());
        } else {
            System.out.println("Cricketer not found!!!");
        }
    }

    public static Cricketer searchCricketerByName(List<Cricketer> cricketerList, String name) {

        for (Cricketer cricketer : cricketerList) {
            if (cricketer != null && cricketer.getName().equals(name))
                return cricketer;
        }
        return null;
    }

    public static void displayAllCricketers(List<Cricketer> cricketers) {
        for (Cricketer cricketer : cricketers) {
            System.out.println(cricketer);
        }
    }


}
