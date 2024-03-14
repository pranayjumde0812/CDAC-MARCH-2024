#include<iostream>
#include<string.h>
#include<fstream>

using namespace std;

namespace EmployeeManagement {
	
	class Employee {
		
		private : 
		          int id;
		          char name[20] , departmentName [20];
		          
		public :
				Employee();
				Employee (int id, char* name, char* departmentName);
		public :
				void acceptDetails(int id, char* name, char* departmentName);
				void displayEmployeeDetails();          
	};
	

	void writeEmployee(string filename, Employee &employee);
	void readEmployee(string filename);
	
}
