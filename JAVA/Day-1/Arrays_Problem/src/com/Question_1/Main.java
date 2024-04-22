package com.Question_1;
//1. Array Assignments:
//        Create a Java program that performs various operations on arrays, such as finding the
//        maximum element, calculating the sum and average, and sorting the elements in ascending
//        order.
//        Tasks:
//        a. Implement a method to find the maximum element in an array.
//        b. Implement a method to calculate the sum of all elements in an array.
//        c. Implement a method to calculate the average of all elements in an array.
//        d. Implement a method to sort the elements of an array in ascending order using any
//        sorting algorithm of your choice (e.g., bubble sort, selection sort).
//        e. Write a main program to demonstrate these operations:
//        f. Create an array of integers and initialize it with some values.
//        g. Call the methods implemented in steps 1 to 4 to perform the respective operations.
//        h. Display the results of each operation.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        ArrayOperationUtility.acceptArrayElement(arr);
        ArrayOperationUtility.findMaximumElementAndSortArray(arr);
        ArrayOperationUtility.calculateSumAndAverageOfAllArrayElement(arr);
    }
}