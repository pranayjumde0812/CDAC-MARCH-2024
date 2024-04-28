package com.Question_3;

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
public class BankAccount {

    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount() {
        accountNumber = 0;
        accountHolderName = "NIL";
        balance = 0.0;
    }

    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account Number = " + accountNumber +
                "\nAccount Holder Name = '" + accountHolderName + '\'' +
                "\nBalance = " + balance;
    }
}
