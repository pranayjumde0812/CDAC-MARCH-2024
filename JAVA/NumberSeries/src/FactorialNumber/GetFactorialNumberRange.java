package FactorialNumber;

import java.util.Scanner;

public class GetFactorialNumberRange {

    Scanner sc = new Scanner(System.in);

    public void factorialOfGivenRange() {

        System.out.print("Enter the end number of range: ");

        int range = sc.nextInt();

        for (int i = 1; i <= range; i++) {
            System.out.println("Factorial of " + i + "! = " + fact(i));
        }
    }

    int fact(int n) {

        int fact = 1;

        while (n > 0) {
            fact = fact * n;
            n--;
        }
        return fact;
    }
}
