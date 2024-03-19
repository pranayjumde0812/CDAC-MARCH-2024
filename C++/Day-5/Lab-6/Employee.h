#include <iostream>
#include<string>

using namespace std;

class Employee{
	
	public : 
				int id;
    		    string name;
				int deptId;
				double basicSalary;
	
	public : 
			Employee();
	 		Employee(int id, string name, int deptId, double basicSalary);
	 		
			virtual double computeNetSalary();
};


class Manager : public Employee {
	
	protected : 
				double performanceBonus;
				double netSalary;
	
	public : 
			Manager();
			Manager(int id, string name, int deptId, double basicSalary, double performanceBonus);
			
    		double computeNetSalary();
	
};

class Worker : public Employee {
	
	protected:
    		   double hoursWorked;
   			   double hourslyRate;
   			   double netSalary;

	
	public :
			 Worker();
	
			 Worker(int id, string name, int deptId, double basicSalary, double hoursWorked, double hourslyRate);
	
	         double computeNetSalary();
	
			 double getHourlyRate();	
		
};



