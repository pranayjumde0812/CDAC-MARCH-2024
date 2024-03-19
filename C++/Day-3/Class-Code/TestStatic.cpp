#include<iostream>
using namespace std;
class Date{
	
	int day,month,year;//copy created per object
   static int counter;
	public:Date()
	{
		day=1;month=2;year=2020;
		counter=counter+1;
	}
	Date(int d,int m,int y)
	{
		day=d;month=m;year=y;
		counter=counter+1;
	}
	void display()
	{
		cout<<"---Total Numer Object Created :"<<counter<<endl;
		cout<<"DAte:"<<day<<"/"<<month<<"/"<<year<<endl;
	}

static void showCount()
{
	//static methods can access static data members only
	//instace data members are not accesible inside static method
	//this pointer never passed to static method
	
	//static methods get called using className::
	//day=90;//error:
	cout<<"Total Numer Object Created :"<<counter<<endl;
		
}
};
int Date::counter=0;
int main()
{
	//static method
	Date::showCount();
	
    Date d1(12,12,2012);	
	d1.display();//instance method
	cout<<"\n\n"<<endl;
	Date d2(30,12,2023);	
	d2.display();
	cout<<"\n\n"<<endl;
	Date d3(4,5,2014);	
	d3.display();
	
	cout<<"\n\n"<<endl;
	Date::showCount();
}

