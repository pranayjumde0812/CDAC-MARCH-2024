package com.Question_3;

import java.util.Scanner;

//3. Bank Account Management System
//        Create a simple Bank Account Management System that allows users to perform basic
//        operations such as depositing money, withdrawing money, and checking their account
//        balance.
//        Tasks:
//        a. Define a class named BankAccount with the following attributes:
//        i. accountNumber: Unique identifier for each bank account.
//        ii. accountHolderName: Name of the account holder.
//        iii. balance: Current balance in the account.
//        b. Implement appropriate constructors and methods for the BankAccount class:
//        i. Include methods to deposit money into the account, withdraw money from
//        the account, and check the account balance.
//        ii. Ensure that the balance cannot be negative after a withdrawal.
//        c. Create a main program to interact with the BankAccount class:
//        i. Allow users to perform operations such as depositing money, withdrawing
//        money, and checking their account balance using a simple menu-driven interface.
//        ii. Prompt users to enter the necessary information for each operation (e.g.,
//        account number, account holder name, amount to deposit/withdraw).
//        iii. Display appropriate messages to indicate the success or failure of each
//        operation.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount;
        System.out.println("Enter account details : ");
        System.out.print("Enter Account Number : ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter Account holder Name : ");
        String accountHolderName = sc.next();
        System.out.print("Enter 1st time balance : ");
        double balance = sc.nextDouble();

        bankAccount = new BankAccount(accountNumber, accountHolderName, balance);
        int choice;
        do {
            System.out.println("\n1. Deposit Money | 2. Withdraw Money | 3. Account Balance | 4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the Amount : ");
                    double depositAmt = sc.nextDouble();
                    UtilityOperations.depositMoney(bankAccount, depositAmt);
                    break;
                case 2:
                    System.out.print("Enter the Amount : ");
                    double withdrawAmt = sc.nextDouble();
                    UtilityOperations.withdrawMoney(bankAccount, withdrawAmt);
                    break;
                case 3:
                    UtilityOperations.displayAccountBalance(bankAccount);
                    break;
                case 4:
                    System.out.println("Exit.......");
                default:
                    System.out.println("Invalid choice...");
            }
        } while (choice != 4);
    }
}
