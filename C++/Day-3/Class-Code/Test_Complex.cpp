#include<iostream>
#include<string.h>

using namespace std;
class Complex{
	int i,r;
	public:Complex()
	{
		i=1;
		r=2;
	}
	Complex(int i,int r)
	{
		this->i=i;
	this->r=r;
	}
	void display()
	{
		cout<<"Complex :"<<i<<"  "<<r<<endl;
	}
	~Complex(){
	cout<<"----object get destroyed----"<<endl;
		
	}
	
};


int main90()
{
	
	
	Complex c1(12,3);//local variable on stack
	c1.display();
	
	//create object and store data mem on heap
	Complex* obj=new Complex(90,80);//heap area
	obj->display();
	
	delete obj;//imp
	
	
}

