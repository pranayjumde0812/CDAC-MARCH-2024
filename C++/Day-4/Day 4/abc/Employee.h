#include<iostream>
using namespace std ;

class Employee{

       
      public :
          int empid ;
          string name ;
          double basic_Salary ;



public:
    
     Employee(){
      this->empid=0;
      this->name="Anchal";
      this->basic_Salary=100000;

     }


  Employee(int empid , string name , double basic_Salary ){
    this->empid=empid;
    this->name=name;
    this->basic_Salary=basic_Salary;


  }
  virtual  void display(){

    cout<<"empid is "<<empid<<endl ;
    cout<<"name"<<name<<endl;
    cout<<"basicSalary"<<basic_Salary<<endl;
  }

    virtual   double computeNetSalary(){
         return 0 ;
    };
    
  
};

