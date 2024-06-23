package com.app.sll;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList l1 = new LinkedList();
        boolean exit = false;
        
        l1.insert(10);
        l1.insert(20);
        l1.insert(30);
        l1.insert(40);
        l1.insert(50);
        l1.insert(50);
        l1.insert(100);
        l1.insert(60, 8);
        l1.insert(55, 4);
        l1.insert(50, 6);

        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert elements into the linked list");
            System.out.println("2. Display the linked list");
            System.out.println("3. Reverse the linked list by recursion");
            System.out.println("4. Reverse the linked list without recursion");
            System.out.println("5. Display the length of the linked list");
            System.out.println("6. Display the 3rd last element from the linked list");
            System.out.println("7. Display the 4th element from the linked list");
            System.out.println("8. Remove Nth node from the end of the linked list");
            System.out.println("9. Insert an element at the middle of the linked list");
            System.out.println("10. Sort the linked list");
            System.out.println("11. Remove all elements that match a given value");
            System.out.println("12. Remove duplicates from unsorted list");
            System.out.println("13. Remove duplicates from sorted list");
            System.out.println("14. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                	boolean exit1 = false;
                	while(!exit1)
                	{
                		System.out.println("1.Insert value \n2.Insert by position\n3.Exit");
                		System.out.println("Enter your choice");
                		switch(sc.nextInt())
                		{
                		case 1:
                			System.out.println("Enter the element which you want to insert:");
                			int d = sc.nextInt();
                            l1.insert(d);
                			break;
                		case 2:
                			System.out.println("Enter the element and position which u want to insert:");
                			l1.insert(sc.nextInt(), sc.nextInt());
                
                			break;
                		case 3:
                			exit1 = true;
                			break;
                		}
                	}
                	
                    break;
                case 2:
                    l1.display();
                    break;
                case 3:
                    System.out.print("\nReverse by recursion: ");
                    l1.displayReverse(l1.getHead());
                    break;
                case 4:
                    System.out.println("\nReverse without recursion:");
                    l1.reverse();
                    l1.display();
                    break;
                case 5:
                    System.out.println("\nNo. of elements in the singly linked list:");
                    System.out.println(l1.getCnt());
                    break;
                case 6:
                    System.out.println("\n3rd last element from linked list: ");
                    l1.nthElementFromLast(3);
                    break;
                case 7:
                    System.out.println("\n4th element from linked list: ");
                    l1.nthElementFromstart(4);
                    break;
                case 8:
                    System.out.println("\nEnter the node position which you want to delete from end:");
                    int n = sc.nextInt();
                    l1.deleteByPosition(n);
                    System.out.println("\nLinked list after deleting last nth element:");
                    l1.display();
                    System.out.println("\nCount after deleting node:");
                    System.out.println(l1.getCnt());
                    break;
                case 9:
                	System.out.println("\nEnter the element which you want to add at middle:");
                    int n1 = sc.nextInt();
                    l1.insertAtMiddle(n1);
                    l1.display();
                    break;
                case 10:
                    System.out.println("\nSorting of list in linked list:");
                    l1.sortList();
                    l1.display();
                    break;
                case 11:
                	System.out.println("\nEnter the element which you want to remove");
                    int n2 = sc.nextInt();
                    while (l1.deleteByVal(n2));
                    System.out.println("\nAfter removing all elements which match with given value:");
                    l1.display();
                    System.out.println("\nCount after deleting nodes:");
                    System.out.println(l1.getCnt());
                    break;
                    
                case 12:
                	 l1.removeDup();
                	 System.out.println("Removed duplicates successfully!!!");
                	
                	break;
                	
                case 13:
                	
                	l1.removeDupFromSort();
               	 System.out.println("Removed duplicates successfully!!!");
               	
               	break;
                case 14:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        }
        sc.close();
    }
}
