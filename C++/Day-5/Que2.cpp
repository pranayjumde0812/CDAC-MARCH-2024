#include<bits/stdc++.h>

using namespace std;
class BankAccount
{
private:
    int accNo;
    double balance;
    string cName;
public:
     BankAccount(int accNo,double balance,string cName){
        this->accNo = accNo;
        this->balance = balance;
        this->cName = cName;
     };
     void display(){
        cout<<"acc number: "<<accNo;
        cout<<"\nbalance: "<<balance;
        cout<<"\ncustomer name: "<<cName;
     }

    void withDraw(double amt){
        if(amt >this->balance){
            cout<<"insufficiet balance\n";
            return;
        }
        this->balance = this->balance - amt;
    }
    void deposit(double amt){
        this->balance = this->balance+amt;
    }
    ~ BankAccount(){
        cout<<endl;
    };
};


int main(){
BankAccount b(355241,700000,"Viru");
b.display();
cout<<"\n---------\n";
b.withDraw(5000);
cout<<"\n---------\n";
b.display();
cout<<"\n---------\n";
b.deposit(10000);
cout<<"\n---------\n";
b.display();

return 0;
}
