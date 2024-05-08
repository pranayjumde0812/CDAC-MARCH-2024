package FactorialNumber;

import java.util.Scanner;

public class GetFactorialNumber {

    static Scanner sc = new Scanner(System.in);

    public void findFactorialOfNumber() {

        System.out.print("Enter the number: ");

        int number = sc.nextInt();

        int fact = 1;

        for (int i = 1; i <= number; i++) {

            fact = fact * i;
        }
        System.out.println("The factorial of number " + number + "! = " + fact);
    }

}
