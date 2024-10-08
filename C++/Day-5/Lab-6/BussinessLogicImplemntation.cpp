#include <iostream>
#include<string>
#include "Employee.h"

using namespace std;


Employee :: Employee(){
	cout<<"....Default Constructor of Employee.....\n";
}

Employee :: Employee(int id, string name, int deptId, double basicSalary){	
	    this->id = id;
		this->name = name;
		this->deptId = deptId;
		this->basicSalary = basicSalary; 
}

 double Employee ::  computeNetSalary(){
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

Worker :: Worker(int id, string name, int deptId, double basicSalary, double hoursWorked, double hourslyRate) : Employee(id,name,deptId,basicSalary){
		this->hoursWorked = hoursWorked;
		this->hourslyRate = hourslyRate;
}

double Worker :: computeNetSalary(){
		
//		cout<<hoursWorked<<endl;
//		cout<<hourslyRate<<endl;
			
		netSalary = basicSalary + (hoursWorked * hourslyRate) ;
		return netSalary;
		
}

double Worker :: getHourlyRate(){
	
	   return this->hourslyRate;
}


