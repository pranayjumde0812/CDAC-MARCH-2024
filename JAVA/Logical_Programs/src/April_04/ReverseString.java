package January_29;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the String to be reversed  : ");

        String string = "ABCD";

        // By charAt() method
        String nstr = "";

        int length = string.length();

        for (int i = length - 1; i >= 0; i--) {
            nstr = nstr + string.charAt(i);
        }

        System.out.println(nstr);

        // by character Array

        char[] ch = string.toCharArray();


    }
}
