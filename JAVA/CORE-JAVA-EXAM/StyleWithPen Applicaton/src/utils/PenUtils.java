package utils;

import pojo.Pen;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class PenUtils {

    public static Map<Integer, Pen> addNewPen(Scanner sc, Map<Integer, Pen> map) {

        System.out.println("Enter the Pen Details");
        System.out.println("Brand , Color, InkColor, Material, Stock(Quantity), " +
                "Price, Discount");
        Pen pen = new Pen(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextDouble());

        map.put(pen.getPid(), pen);

        return map;
    }

    public static String updateStock(Scanner sc, Map<Integer, Pen> map) {

        System.out.println("Enter Id of Stock to update the stock");
        int id = sc.nextInt();

        if (map.containsKey(id)) {
            System.out.println("Enter new Stock value");
            Pen pen = map.get(id);
            pen.setStock(pen.getStock() + sc.nextInt());
            pen.setStockUpdateDate(LocalDate.now());
            return "Stock updated successfully";
        } else
            return "Invalid Id... Pen is not present in stock";
    }

    public static void set20PercentDiscount(Map<Integer, Pen> map) {

        for (Pen pen : map.values()) {
            if (calculateDateDifference(pen.getStockUpdateDate(), 3)) {
                pen.setDiscount(20);
                System.out.println("Discount for " + pen.getPid() + " is updated to 20%");
            }
        }
    }

    public static void deleteNotSoledPenIn9Months(Map<Integer, Pen> map) {

        Collection<Pen> values = map.values();
        List<Pen> list = new ArrayList<>(values);
        Iterator<Pen> iterator = list.iterator();

        while (iterator.hasNext()) {
            Pen pen = iterator.next();

            if (calculateDateDifference(pen.getStockUpdateDate(), 9)) {
                Pen remove = map.remove(pen.getPid());
                System.out.println("Pen with ID " + remove.getPid() + " is removed from stocks");
            }
        }

    }

    public static boolean calculateDateDifference(LocalDate date, int month) {

        return Period.between(date, LocalDate.now()).getMonths() > month;
    }

}
