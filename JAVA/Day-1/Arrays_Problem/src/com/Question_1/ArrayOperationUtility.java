package com.Question_1;

import java.util.Scanner;

public class ArrayOperationUtility {

    public static void acceptArrayElement(int[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Elements to array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void findMaximumElementAndSortArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Maximum number from array = " + arr[arr.length - 1]);
        System.out.print("Sorted Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void calculateSumAndAverageOfAllArrayElement(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float avg = (float) sum / arr.length;

        System.out.println("\nSum of all array Elements = " + sum);
        System.out.println("Average of all array Elements = " + avg);
    }
}
