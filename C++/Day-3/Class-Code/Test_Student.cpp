#include<iostream>
#include<string.h>
#include<bits/stdc++.h>
using namespace std;

class Student{
	private:int  rollno;
	        char* name;
	        double m1,m2,m3;
	        double total;
	        char grade;
	        void calTotal()
		   {
		   	total=m1+m2+m3;
		   }
	public :Student()
	       {
	       	
		cout<<"----default----"<<endl;
		this->rollno=10;
		this->name=new char;
		*name='\0';
		m1=m2=m3=0;
		cout<<"Student get created ";
		   }     
		  Student(int rollno,char* name,int m1,int m2,int m3)
		  {
		  	this->rollno=rollno;
		  this->name=new char[strlen(name)+1];
		  strcpy(this->name,name );
		  this->m1=m1;
		  this->m2=m2;
		  this->m3=m3;
		  this->total=0;
		 cout<<"Student get created ";
		  } 
		  void assignValues(int rollno,char* name,int m1,int m2,int m3)
		   {
		   	this->rollno=rollno;
		  this->name=new char[strlen(name)+1];
		   strcpy(this->name,name );
		  this->m1=m1;
		  this->m2=m2;
		  this->m3=m3;
		  this->total=0;
		   	
		   }  
		  
		   void display()
		   {
		   	//inside public method call private method
		   	//private methods:helper methods
		   	calTotal();
		   cout<<"\n rollno :"<<rollno<<" ";
		   for(int i=0;i<strlen(this->name);i++)
		   {
		   	cout<<*(name+i);
		   	}
			cout<<"  m1="<<m1<<"   m2="<<m2<<"    m3="<<m3<<"   total="<<total<<endl;   	
		   }



//to edit individual data members write funtions
//to read individual data member use accessors (getters)
//to write individual data member use mutators(setters)

//need:student want to edit name    (/city/email)
 void setName(char* name)
 {
 	strcpy(this->name,name);
 }
 //edit m1 m2 m3
 
void setM1(int m1)
{
	this->m1=m1;
}
//read individual
int getM1()
{
	return this->m1;
}
int getRollNo()
{
	return this->rollno;
}
};
int main6()
{
 	//Student obj;// error :as no default constr given in class
	//obj.print();
	
	Student std1(202,"Mitali",40,50,60);
	std1.display();
   //std1.calTotal();//private
   
   	Student std2(203,"Nitesh",80,99,64);
	std2.display();
   cout<<" change name  "<<endl;
   std2.setName("vaishali");
   std2.setM1(90);
   cout<<" changed M1="<<std2.getM1()<<"  for rollno ="<<std2.getRollNo()<<endl;
   cout<<"\n\n";
   std2.display();
   
   
	cout<<"------end------"<<endl;
}

//lab:for student class create 3 private methods(helper)
//calGrade
//calTotal
//calPercentage
//call these inside public







