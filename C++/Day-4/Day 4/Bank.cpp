/*Bank Account Inheritance:
Problem Statement: Design a system for managing bank accounts.
 Create a base class BankAccount with attributes like account number and balance.
  Derive classes like SavingsAccount and CheckingAccount, 
  each with specialized methods like withdraw() and calculate_interest().
*/


#include<iostream>
using namespace std;

class BankAccount{
 int accountNumber;
   protected : int Initbalance;


 public:
 BankAccount(int accountNumber = 0, int Initbalance=0){
    this->accountNumber=accountNumber;
    this->Initbalance=Initbalance;
 }
  virtual void displayAccDetails(){
    cout<<"Account Number : "<<accountNumber;
    cout<<"balance :"<<Initbalance;
}
};

class SavingsAccount : public BankAccount
{
    int CurrentBalance ;


public :
SavingsAccount(int accountNumber, int Initbalance , int CurrentBalance ) : BankAccount(accountNumber , Initbalance){
  this->CurrentBalance=CurrentBalance ;
  
}

void withdraw(int amount){
      if(amount>CurrentBalance)
      cout<<"You have insufficient balance"<<endl;
      else 
      CurrentBalance=CurrentBalance-amount;
}
void displayAccDetails(){
    BankAccount::displayAccDetails();
    cout<<"Current Balance :"<<CurrentBalance<<endl;
}

};


class CheckingAccount : public BankAccount
{   
     private :
     int n ;
     int Rate = 10;
        

public :
CheckingAccount(int accountNumber, int Initbalance , int n  ): BankAccount(accountNumber , Initbalance)
{
 this->n=n;
  
}
// void setRate(int Rate){

//    this-> Rate = 10;
//  }
//  int getRate(){

//      return Rate;
//  }
void CalIneterest(){
   //   setRate(10);
    //  int r = getRate();
     double  Interest = Initbalance*Rate*n*0.01;
    cout<<"Interest is :"<<Interest<<endl;
}

};


int main(){
     SavingsAccount s (21254 ,500000,500000);
     s.withdraw(100000);
     s.displayAccDetails();

     cout<<"---------------------------------------------"<<endl;


     CheckingAccount c (21589,200000,5);
     c.CalIneterest();
     
     return  0 ;
}