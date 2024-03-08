// Que 6. Write a program, which accepts annual basic salary of an employee and calculates and displays the 
//        Income tax as per the following rules. 
//        Basic: < 1, 50,000 Tax = 0
//        1, 50,000 to 3,00,000 Tax = 20% 
//        > 3,00,000 Tax = 30%

#include<iostream>
using namespace std;

// Function prototype
float calculateIncomeTaxOnSalary(float annualBasicSalary, float rateOfDeduction);

int main(){
	
	float annualBasicSalary;
	float salaryAfterTaxDeduction;
	
	cout<<"Enter the Annual Basic Salary = "<<endl;
	cin>>annualBasicSalary;
	
	if(annualBasicSalary < 150000){
		cout<<"In this salary slab 0% deduction in salary"<<endl;
		cout<< "Salary after 0% tax deduction is Rs. = "<<annualBasicSalary;
	}else if(annualBasicSalary >= 150000 && annualBasicSalary <= 300000){
		cout<<"In this salary slab 20% tax deduction."<<endl;
	    salaryAfterTaxDeduction = calculateIncomeTaxOnSalary(annualBasicSalary, 0.2);
		cout<< "Salary after 20% tax deduction is Rs. = "<<salaryAfterTaxDeduction;
	}else if(annualBasicSalary > 300000){
		cout<<"In this salary slab 30% tax deduction."<<endl;
	    salaryAfterTaxDeduction = calculateIncomeTaxOnSalary(annualBasicSalary, 0.3);
		cout<< "Salary after 30% tax deduction is Rs. = "<<salaryAfterTaxDeduction;
	}else{
		cout<<"Invalid input!!!!!";
	}
	
}

float calculateIncomeTaxOnSalary(float annualBasicSalary ,float rateOfDeduction) {
		
		annualBasicSalary = annualBasicSalary - annualBasicSalary * rateOfDeduction;
		
		return annualBasicSalary;
		
	}
