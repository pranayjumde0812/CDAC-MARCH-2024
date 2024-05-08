package PrimeNumber;
import java.util.Scanner;

public class GetPrimeNumber {
    Scanner sc = new Scanner(System.in);
    public void findPrimeNumber() {
        System.out.print("Enter the number: ");

        int number = sc.nextInt();

        int divisibleRange = number / 2;
        int flag = 0;

        if (number == 0 || number == 1) {
            System.out.println("The given number " + number + " is not a prime number.");
        } else {
            for (int i = 2; i <= divisibleRange; i++) {
                if (number % i == 0) {
                    flag = 1;
                    System.out.println("The given number " + number + " is not a prime number");
                    break;
                }
            }
            if (flag == 0)
                System.out.println("The given number " + number + " is a prime number");
        }
    }
}
