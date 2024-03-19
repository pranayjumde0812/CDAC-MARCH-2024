#include <iostream>
#include<string>
#include "Employee.h"

//#ifndef EMPLOYEE_H
//#define EMPLOYEE_H

// Content of Employee.h goes here

//#endif // EMPLOYEE_H

using namespace std;

//implemetaion of all methods from Employee.h

Employee :: Employee(){
	cout<<"....Default Constructor of Employee.....\n";
}

Employee :: Employee(int id, string name, int deptId, double basicSalary){	
	    this->id = id;
		this->name = name;
		this->deptId = deptId;
		this->basicSalary = basicSalary; 
}

double Employee :: computeNetSalary(){
	return 0;
}

//////////////////////////////////////////////////////////

Manager :: Manager() {
		cout<<"....Default Constructor of Manager.....\n";
}

Manager :: Manager(int id, string name, int deptId, double basicSalary, double performanceBonus) : Employee(id,name,deptId,basicSalary){
		cout<<"....Parameterized Constructor of Manager.....\n";
		this->performanceBonus = performanceBonus;

}

double Manager :: computeNetSalary(){
		
		netSalary = basicSalary + performanceBonus;
		
		return netSalary;
}

////////////////////////////////////////////////////////////

Worker :: Worker(){
	
		cout<<"....Default Constructor of Manager.....\n";
}

Worker :: Worker(int id, string name, int deptId, double basicSalary, double hoursWorked, double hourlyRate) : Employee(id,name,deptId,basicSalary){
		cout<<"....Parameterized Constructor of Manager.....\n";
		this->hoursWorked = hoursWorked;
		this->hourlyRate = hourlyRate;
}

double Worker :: computeNetSalary(){
		
		double hourslySal = hoursWorked * hourlyRate;   /// Salary is not getting add on hourly based 	
		netSalary = basicSalary + hourslySal ;
		return netSalary;
		
}

double Worker :: getHourlyRate(){
	
	   return hourlyRate;
}


