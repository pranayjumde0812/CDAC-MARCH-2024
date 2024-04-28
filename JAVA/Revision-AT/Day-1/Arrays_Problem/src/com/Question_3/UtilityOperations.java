package com.Question_3;

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
public class UtilityOperations {

    public static void depositMoney(BankAccount bankAccount, double balance) {
        double currentBalance = bankAccount.getBalance();
        bankAccount.setBalance(currentBalance + balance);
        System.out.println("Rs. " + balance + " credited to your bank account " + bankAccount.getAccountNumber());
    }

    public static void withdrawMoney(BankAccount bankAccount, double balance) {
        double currentBalance = bankAccount.getBalance();
        if (currentBalance < balance) {
            System.out.println("Insufficient bank balance");
            System.exit(0);
        }
        currentBalance = currentBalance - balance;

        System.out.println("Rs. " + balance + " withdraw from your account number " + bankAccount.getAccountNumber());
        bankAccount.setBalance(currentBalance);
        System.out.println("Available Amount " + currentBalance);
    }

    public static void displayAccountBalance(BankAccount bankAccount) {
        System.out.println("Your Available balance is Rs. " + bankAccount.getBalance());
    }
}
