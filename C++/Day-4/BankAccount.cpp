#include<iostream>
#include<string.h>
using namespace std;

class BankAccount {
	
	private :
		string name;
		int accountNumber;
		double balance;
		
	public :
		
		BankAccount(){
			cout<<"Default call"<<endl;
		}
		
		BankAccount(string name, int accountNumber, double balance){
			this->name = name;
			this->accountNumber = accountNumber;
			this->balance = balance;
		}
	
	void setName(string name){
		this->name = name;
	}
	
	void setAccountNumber(int accountNumber){
		this->accountNumber = accountNumber;
	}
	
	void setBalance(double balance){
		this->balance = balance;
	}
	
	string getName(){
		return name;
	}
	
	int getAccountNumber(){
		return this->accountNumber;
	}
	
	double getBalance(){
		return balance;
	}
	
	
	void sendMoney(double money, BankAccount &toAcc){
		toAcc.balance = toAcc.balance + money;
		balance = balance - money;
	}
	
	void depositeMoney(double money){
		balance = balance + money;
	}
	
	void displayBalance(){
		cout<<"Account balance = "<<balance<<" for Account holder Name = "<<name<<endl;
	}
};


int main(){
	
	BankAccount ba1;
	ba1.setName("Pranay");
	ba1.setAccountNumber(123);
	ba1.setBalance(10000);
	
	ba1.displayBalance();
	
	BankAccount ba2;
	ba2.setName("Anuj");
	ba2.setAccountNumber(456);
	ba2.setBalance(15000);
	ba2.displayBalance();
	ba2.sendMoney(4000,ba1);
	
	ba1.displayBalance();
	ba2.displayBalance();
	
	ba1.depositeMoney(20000);
	ba1.displayBalance();
	
}






















