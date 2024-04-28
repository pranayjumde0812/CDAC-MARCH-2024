package com.arrays;

import java.util.Scanner;

public class AdditionOf2DMatrix {

    public static int[][] additionOf2DArray(int[][] arr1, int[][] arr2, int row, int col) {
        int[][] sumOfArray = new int[row][col];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sumOfArray[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return sumOfArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows of array :");
        int row = sc.nextInt();
        System.out.print("Enter column of array :");
        int col = sc.nextInt();
        int[][] arr1 = new int[row][col];
        int[][] arr2 = new int[row][col];
        int[][] sumOfArray;

        System.out.println("Enter element of Array 1: ");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter element of Array 2: ");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        sumOfArray = additionOf2DArray(arr1, arr2, row, col);

        System.out.println("Display Addition of array: ");
        for (int i = 0; i < sumOfArray.length; i++) {
            for (int j = 0; j < sumOfArray[i].length; j++) {
                System.out.print(sumOfArray[i][j] + " ");
            }
            System.out.println();
        }

    }
}
