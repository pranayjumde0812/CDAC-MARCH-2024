package January_29;

import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be reversed  : ");
        int enteredNumber = sc.nextInt();

        // logic 1 : using algorithm
//        int rev = 0;
//
//        while (enteredNumber != 0) {
//            rev = rev * 10 + (enteredNumber % 10);
//            enteredNumber /= 10;
//        }
//        System.out.println(rev);

        // Logic 2 : using StringBuffer class

//        StringBuffer sb = new StringBuffer(String.valueOf(enteredNumber));
//
//        StringBuffer reverse = sb.reverse();
//
//        Integer i = Integer.valueOf(reverse.toString());
//        System.out.println(i);

        // Logic 3 : Using StringBuilder

        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder reverse = stringBuilder.append(enteredNumber).reverse();

        int i = Integer.parseInt(reverse.toString());
        System.out.println(i);

    }
}
