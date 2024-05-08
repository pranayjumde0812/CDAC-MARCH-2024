package EvenOdd;

import java.util.Scanner;

public class GetEvenOrOddNumber {
    Scanner sc = new Scanner(System.in);

    public void findEvenOrOddNumber() {

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("The given number " + number + " is even.");
        } else
            System.out.println("The given number " + number + " is odd.");
    }
}
