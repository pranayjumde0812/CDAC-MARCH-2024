package com.collage;

import java.util.Scanner;

public class UtilityOperation {

    public static void acceptClassroomDetails(Classroom[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter ClassRoom Id : ");
            int roomId = sc.nextInt();
            System.out.println("Enter Name : ");
            String roomName = sc.next();
            System.out.println("Enter Teacher Details : ");
            System.out.println("Enter Teacher Id : ");
            int teacherId = sc.nextInt();
            System.out.println("Enter Teacher Name : ");
            String teacherName = sc.next();
            System.out.println("Enter Designation of Teacher : ");
            System.out.println("1. Professor | 2. Assistant Professor");
            Designation desg = null;
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    desg = Designation.PROFESSOR;
                    break;
                case 2:
                    desg = Designation.ASSISTANT_PROFESSOR;
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.exit(0);
            }
            arr[i] = new Classroom(roomId, roomName, new Teacher(teacherId, teacherName, desg));
        }
    }

    public static void displayClassroomDetails(Classroom[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Classroom " + i + 1);
            System.out.println(arr[i]);
            System.out.println("=======================================================");
        }
    }
}
