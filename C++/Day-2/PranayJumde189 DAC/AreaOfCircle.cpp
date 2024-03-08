#include<iostream>
#include<math.h>
using namespace std;

class Circle {
	
	private : float radius;
	
	
	public : void display(){
		cout<<"Radius of Circle  = "<<radius<<endl; 
	}
	
	public : float areaOfCircle(){
		
		const float PI = 3.141;
		
		float area = PI * radius * radius ;
		
		return area;
	}
	
	void assignValue(float radius);
	
};

void Circle :: assignValue(float rad){
	radius = rad;
}

int main(){
	
	Circle circle;
	
	float radius;
	cout<<"Enter the radius of circle : "<<endl;
	cin>>radius;
	
	circle.assignValue(radius);
	circle.display();
	float areaOfCircle = circle.areaOfCircle();
	
	cout<<"Area of Circle = "<< areaOfCircle<<endl;
	
	return 0;
}
