package com.collage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of classroom : ");
        int size = sc.nextInt();
        Classroom[] arr = new Classroom[size];
        UtilityOperation.acceptClassroomDetails(arr);

        UtilityOperation.displayClassroomDetails(arr);
    }
}