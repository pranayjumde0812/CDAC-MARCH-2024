#include<iostream>
#include<string.h>

using namespace std;
class cStudent{
	private:int  rollno;
	        char* name;
	        double m1,m2,m3;
	        double total;
	        char grade;
	        void calTotal()
		   {
		   	total=m1+m2+m3;
		   }
	public :cStudent()
	       {
	       	
		cout<<"----default----"<<endl;
		this->rollno=10;
		this->name=new char;
		*name='\0';
		m1=m2=m3=0;
		cout<<"Student get created ";
		   }     
		  cStudent(int rollno,char* name,int m1,int m2,int m3)
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

~cStudent()
{
cout<<"---destroying Student object----"<<endl;
 
 delete name;	
	
	
}
};


int main68()
{
int arr[5];
arr[0]=10;arr[1]=20;arr[2]=30;arr[3]=40;arr[4]=50;

for(int i=0;i<5;i++)
{
	cout<<arr[i]<<"  ";
}
cout<<"\n--------create Array of Student--------"<<endl;

cStudent iacsd[5];
cStudent std1(101,"Ram",90,80,70);//	
cStudent std2(102,"Seeta",20,30,70);
cStudent std3(103,"Mitesh",30,20,50);
cStudent std4(104,"Ritu",50,80,70);
cStudent std5(105,"Neeta",60,70,10);
	
	iacsd[0]=std1;
	iacsd[1]=std2;
	iacsd[2]=std3;
	iacsd[3]=std4;
	iacsd[4]=std5;
	 
	
cout<<"\n\n----display all details------"<<endl;

for(int i=0;i<5;i++)
{
	iacsd[i].display();
	cout<<"\n";
	}	
cout<<"\n\n----display all rollno------"<<endl;

for(int i=0;i<5;i++)
{
	 cout<<"RollNO:"<<iacsd[i].getRollNo();
	cout<<"\n";
	}	
//lab:search Student  by accepting rollno from user	
//if found then display that student details	
//lab:edit name of student
//lab:show all students total marks
//lab:show students details whose total>250
	
	
}
