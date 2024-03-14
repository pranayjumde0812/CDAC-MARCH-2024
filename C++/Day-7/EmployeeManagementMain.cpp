#include<iostream>
#include<string.h>
#include<fstream>
#include "EmployeeManagement.h"

using namespace std;

int main(){
	
	typedef	EmployeeManagement :: Employee employee;
	 
	int choice;
	int id;
	char name[20], departmentName[20];
	
	string filename;
	
	employee e1;
	
	do{
		cout<<"choose the below option carefully\n";
		cout<<"1. Add Employee || 2. Display Employee || 3. Write Employee in file || 4.Read from file || 5. Exit"<<endl;
		cin>>choice;
		switch(choice){
			case 1 : 
					cout<<"Id  Name  DepartmentName ; ";
					cin>>id>>name>>departmentName;
					e1.acceptDetails(id,name,departmentName);
					break;
					
			case 2 : 
					cout<<"Employee details\n";
					e1.displayEmployeeDetails();
					break;
					
			case 3 : 
					cout<<"Insert employee in file : \n";
					cout<<"Enter file name\n";
					cin>>filename;
					writeEmployee(filename,e1);
					break;
					
			case 4 : 
					cout<<"Read from file\n";
					cout<<"Enter file name\n";
					cin>>filename;
//					EmployeeManagement :: readEmployee(filename);
					EmployeeManagement :: readEmployee(filename);
					break;
			default :
				
			break	;	
		}
		
	}while(choice != 5);
	
	return 0;
}
