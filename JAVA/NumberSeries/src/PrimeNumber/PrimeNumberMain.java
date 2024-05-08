package PrimeNumber;

import java.util.Scanner;

public class PrimeNumberMain {
    public static void main(String[] args) {
// The number which is divisible by 1 and itself
        GetPrimeNumber getPrimeNumber = new GetPrimeNumber();
        getPrimeNumber.findPrimeNumber();

        ////////////////////////////////////////////////////////////////

        GetRangeOfPrimeNumber getRangeOfPrimeNumber = new GetRangeOfPrimeNumber();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range of number: ");
        int range = sc.nextInt();

        for (int i = 1; i <= range; i++) {
            if (getRangeOfPrimeNumber.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
