#include <iostream>
#include<string>

using namespace std;

class Employee{
	
	protected : 
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
    		   int hoursWorked;
   			   double hourlyRate;
   			   double netSalary;

	
	public :
			 Worker();
	
			 Worker(int id, string name, int deptId, double basicSalary, int hoursWorked, double hourlyRate);
	
	         double computeNetSalary();
	
			 double getHourlyRate();	
		
};



