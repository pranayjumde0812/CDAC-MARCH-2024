//8. Write a  program to input angles of a triangle and check whether triangle is valid or not.

#include<iostream>
using namespace std;

int main(){
	
	int angle1,angle2,angle3;
	
	cout<<"Enter 1st angle = ";
	cin>>angle1;
	cout<<"\nEnter 2nd angle = ";
	cin>>angle2;
	cout<<"\nEnter 3rd angle = ";
	cin>>angle3;
	
	if (angle1+angle2+angle3 == 180){
		cout<<"The sum of all the angles of triangle = 180. Therefore the triangle is valid"<<endl;
	}else{
		cout<<"The sum of all the angles of triangle is not 180. Therefore the triangle is not valid"<<endl;
	}
	
	return 0;
}
