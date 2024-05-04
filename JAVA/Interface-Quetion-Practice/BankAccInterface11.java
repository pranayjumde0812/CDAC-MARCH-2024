/*
11)	BankAccount interface and checking and savings classes:
Create an interface called BankAccount that has three abstract methods:
getBalance(), deposit(), and withdraw(). Then create two classes called
CheckingAccount and SavingsAccount that implement the BankAccount interface.
The CheckingAccount class should have an instance variable for the account's
overdraft limit, and the SavingsAccount class should have an instance variable
for the account's interest rate. Implement the getBalance(), deposit(),
and withdraw() methods for each.
 */

interface BankAccount{
    public void getBalance();
    public void deposite();
    public void withdraw();
}
class CheckingAccount implements BankAccount{
    int overdraft_limit;

    @Override
    public void getBalance() {
        System.out.println("Get the balance checking account");
    }

    @Override
    public void deposite() {
        System.out.println("balance deposited in checking account");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawn successfully from checking account");
    }
}
class SavingAccount implements BankAccount{
    float acc_intrest_rate;

    @Override
    public void getBalance() {
        System.out.println("Balance information in Saving account");
    }

    @Override
    public void deposite() {
        System.out.println("Deposited in Saving account");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdrawn successfully from Saving account");
    }
}

public class BankAccInterface11 {
    public static void main(String[] args) {
     CheckingAccount ca=new CheckingAccount();
     ca.getBalance();
     ca.deposite();
     ca.withdraw();

     SavingAccount sa=new SavingAccount();
     sa.getBalance();
     sa.deposite();
     sa.withdraw();
    }
}
