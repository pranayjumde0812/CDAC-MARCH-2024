#include<iostream>

using namespace std;

class Rectangle {
	
	private : int width, length ;
	
	
	public : void display(){
		cout<<"Width = "<<width<<" & Length = "<<length<<endl; 
	}
	
	public : int areaOfRectangle(){
		
		int area = length * width;
		
		return area;
	}
	
	void assignValue(int length, int width);
	
};

void Rectangle :: assignValue(int len , int wid){
	length = len;
	width = wid;
}

int main(){
	
	Rectangle rect;
	
	int len, wid;
	cout<<"Enter the length of Rectangle : "<<endl;
	cin>>len;
	cout<<"Enter the breadth of Rectangle : "<<endl;
	cin>>wid;
	
	rect.assignValue(len,wid);
	rect.display();
	
	int areaOfRectangle = rect.areaOfRectangle();
	
	cout<<"Area of Rectangle = "<< areaOfRectangle<<endl;
	
	return 0;
}
