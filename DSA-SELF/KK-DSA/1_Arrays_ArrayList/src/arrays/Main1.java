package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        // 1
        System.out.println(arr); // [I@7c30a502

        // 2 input
        System.out.println("Enter " + arr.length + " elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // 3 Display
        // 3.1 normal for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 3.2 for each loop
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();
        // 3.3 Arrays.toString() convert it into string format
        System.out.println(Arrays.toString(arr));
    }
}