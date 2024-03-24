// 5. Create a class Point with data members as x,y. Create Default and Parameterized constructors. Write 
// getters and setters for all the data members. Also add the display function. Create the object of this 
// class in main method and invoke all the methods in that class. 
#include <bits/stdc++.h>
using namespace std;
class Point
{
private:
    double x,y;
    
public:
    Point()
    {
       x=0;
       y=0;
    }

    Point(double x, double y)
    {
        this->x = x;
        this->y = y;
        
    }
    void setx(double x)
    {
        this->x = x;
    }
    void sety(double y)
    {
        this->y = y;
    }
    
    double getX()
    {
        return x;
    }
    double getY()
    {
        return y;
    }
    void display()
    {
        cout << "Point: " << "x , y: "

             <<getX()<<"," << getY() << endl;
    }
};
int main()
{
    cout << "\n-------default constr--------\n";
    Point b;
    b.display();

    cout << "\n------parameterized constr---------\n";
    Point b1(5,7);
    b1.display();

    cout << "\n-------getter setter --------\n";
    Point b2;
    b2.setx(2);
    b2.sety(4.5);
    

    b2.display();
    return 0;
}
