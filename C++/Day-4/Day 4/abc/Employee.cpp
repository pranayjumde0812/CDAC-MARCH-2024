#include<iostream>
#include "Employee.h"
using namespace std ;



class Manager : public Employee{
   public : 
    int depId ;
    int perfbonus;

    
 public:
  Manager(int empid , string name , double basic_Salary,int depId , int perfbonus) : Employee( empid ,  name , basic_Salary ) {
          this->depId=depId;
          this->perfbonus=perfbonus;
 
   
      cout<<"--------------Manager Parametrized Constructor ---------------"<<endl;
 }

     
      void display(){
           Employee::display();
           cout<<"depId :"<<depId<<endl;
           cout<<"perbonus is"<<perfbonus<<endl;
    
  }

 
  double computeNetSalary(){
          this->basic_Salary=basic_Salary;
          this->perfbonus=perfbonus;
           double NetSalary = Employee::basic_Salary+perfbonus;
           return NetSalary;
          }
   
};

  



class Worker: public Employee{
   public : 
    int hoursWorked ;
    int hourlyRate;

    
 public:
 Worker(int empid , string name , double basic_Salary,int hoursWorked , int hourlyRate) : Employee( empid ,  name , basic_Salary ) {
        this->hoursWorked=hoursWorked;
        this->hourlyRate=hourlyRate;
        cout<<"-----------------Worker Parametrized Construcror ----------------"<<endl;
 }  

  void display(){

            Employee::display();
            cout<<"hourseWorked : "<<hoursWorked<<endl;
            cout<<"hourlyrate : "<<hourlyRate<<endl;
  }
   double  computeNetSalary(){
        int NetSalary = Employee:: basic_Salary+(hoursWorked*hourlyRate);
         cout<<"Net Salary is :"<<NetSalary;
         return NetSalary;

          }

 
 };

   int main(){
    
       Employee ep(101,"Rahul",100000) ;
       ep.display();
        ep.computeNetSalary();

        cout<<"----------------------------------------------------"<<endl;

        Manager mg(101 , "Mahesh"  , 100000,122,20000);
        mg.display();
        mg.computeNetSalary();
        double s = mg.computeNetSalary();
        cout<<"Net Salary :"<<s<<endl;
		cout<<"----------------------------------------------------"<<endl;



    Worker w(102 , "Pratik"  , 200000, 2, 5);
        w.display();
        double k = w.computeNetSalary();
        



cout<<" 1.Hire Managers  2.Hire Workers  3.Display All Employee Details  4.Exit"<<endl;  
int ch ;
int i ;
 Employee  * Tata [5];


   Tata[0]=&mg;
   Tata[1]=&w;
  
  	
 return 0 ;


   }
