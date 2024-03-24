#include <iostream>
#include<string.h>
#include<fstream>
#include "EmployeeManagement.h"

using namespace std;

typedef EmployeeManagement :: Employee employee;

employee :: Employee(){
	
}

employee :: Employee(int id, char* name, char* departmentName){
	this->id = id;
	strcpy(this->name, name);
	strcpy(this->departmentName, departmentName);
}

void employee :: acceptDetails(int id, char* name, char* departmentName){
	this->id = id;
	strcpy(this->name, name);
	strcpy(this->departmentName, departmentName);
}

void employee :: displayEmployeeDetails(){
	cout<<"Id: "<<this->id<<" || "<<"Name: "<<this->name<<" || "<<"Department: "<<this->departmentName<<endl;
}

void EmployeeManagement :: writeEmployee(string filename, Employee &emp){
	ofstream obj;
	
	obj.open(filename.c_str(), ios::binary | ios::app);
	
	obj.write((char*) &emp, sizeof(Employee));
	obj.close();
	cout<<"Data stored successfully!!!";
}

void EmployeeManagement :: readEmployee(string filename){
	Employee emp;
	
	ifstream input(filename.c_str(), ios :: binary);
	
	while(input.read((char*) &emp, sizeof(Employee))){
		emp.displayEmployeeDetails();
	}
}

