// 1 Solve this.
// Fresh business scenario to apply inheritance , polymorphism   to emp based organization scenario.
//
// Create Emp based organization structure --- Emp , Mgr , Worker
//
//
// 1.1 Emp state--- id(int), name, deptId , basicSalary(double)
// Accept all of above in constructor arguments.
//
// Methods ---
// 1.2. compute net salary ---ret 0
//(eg : public double computeNetSalary(){return 0;})
//
// 1.2 Mgr state  --- id,name,basic,deptId , perfBonus
// Add suitable constructor
// Methods ----
// 1. compute net salary (formula: basic+perfBonus) -- override computeNetSalary
//
//
// 1.3 Worker state  --id,name,basic,deptId,hoursWorked,hourlyRate
// Methods :
// 1.  compute net salary (formula:  = basic+(hoursWorked*hourlyRate) --override computeNetSalary
// 2. get hrlyRate of the worker  -- add a new method to return hourly rate of a worker.(getter)
//
// Create suitable array to store organization details.
// Provide following options
// 1. Hire Manager
// I/P : all manager details
//
// 2. Hire Worker
// I/P : all worker details
//
// 3. Display information of all employees net salary (by invoking computeNetSal),
//
// 4. Exit

#include <iostream>
// #include<bits/stringfwd.h>
#include <vector>
#include <string>
#include <typeinfo>
#include "Employee.h"

int main()
{

	int id;
	string name;
	double basicSal;
	int deptId;
	double perfBounus;
	double hoursWorked;
	double hourlyRate;

	vector<Employee *> organization;
	int choice;

	do
	{
		cout << "1. Hire Manager || 2. Hire Worker || 3. Display All employees information || 4. Exit " << endl;
		cout << "Enter choice : ";
		cin >> choice;

		switch (choice)
		{
		case 1:
			cout << "Hire Manager" << endl;
			cout << "Enter Id : ";
			cin >> id;
			cout << "Enter Name : ";
			cin >> name;
			cout << "Enter Basic Salary : ";
			cin >> basicSal;
			cout << "Enter Department Id : ";
			cin >> deptId;
			cout << "Enter Performance Bonus : ";
			cin >> perfBounus;

			organization.push_back(new Manager(id, name, deptId, basicSal, perfBounus));
			break;

		case 2:
			cout << "Hire Worker " << endl;
			cout << "Enter Id : ";
			cin >> id;
			cout << "Enter Name : ";
			cin >> name;
			cout << "Enter Basic Salary : ";
			cin >> basicSal;
			cout << "Enter Department Id : ";
			cin >> deptId;
			cout << "Enter Hours Worked : ";
			cin >> hoursWorked;
			cout << "Enter Hourly Rate : ";
			cin >> hourlyRate;
			organization.push_back(new Worker(id, name, deptId, basicSal, hoursWorked, hourlyRate));
			break;

		case 3:
			cout << "Employee Net Salaries:\n";
			for (int i = 0; i < organization.size(); ++i)
			{
				cout << "ID: " << organization[i]->id << ", Name: " << organization[i]->name << ", Net Salary: " << organization[i]->computeNetSalary() << endl;

				if (typeid(*organization[i]) == typeid(Worker))
				{
					Worker *work = dynamic_cast<Worker *>(organization[i]);
					cout << "Hourly rate of worker " << work->name << " is " << work->getHourlyRate() << endl;
				}
			}
			break;
		case 4:
			cout << "Exit...";
			break;

		default:
			cout << "Invalid choice!!!" << endl;
		}
	} while (choice != 4);
}
