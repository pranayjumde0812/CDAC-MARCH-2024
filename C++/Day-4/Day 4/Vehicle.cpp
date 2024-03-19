/*Develop a class hierarchy for vehicles. 
Start with a base class Vehicle and create derived classes like Car, Motorcycle, and Truck. 
Each derived class should have unique properties like the number of wheels 
and specific methods like start_engine().*/

#include<iostream>
using namespace std;

class Vehicle{
    private :
    string name;
    int speed;

    public:
    Vehicle(string name="\0",int speed=0 )
    {
        this->name=name;
        this->speed=speed;
    }
   virtual void displayInfo()
    {
        cout<<"Name: "<<name<<endl;
        cout<<"Speed: "<<speed<<endl;
    }
};
class Car: public Vehicle{
    private:
    int noOfWheels;
    string colour;

    public:
    Car(string name,int speed,int noOfWheels=0,string colour="\0"):Vehicle(name,speed)
    {   
        this->noOfWheels=noOfWheels;
        this->colour=colour;
    }
    void start_engine()
    {
        cout<<"Car engine is strated"<<endl;
    }
    void displayInfo()
    {
        Vehicle::displayInfo();
        cout<<"No Of Wheels: "<<noOfWheels<<endl;
        cout<<"Car color: "<<colour<<endl;
    }

};
class Motorcycle: public Vehicle{
    private:
    int noOfWheels;
    string colour;

    public:
    Motorcycle(string name,int speed,int noOfWheels=0,string colour="\0"):Vehicle(name,speed)
    {
        this->noOfWheels=noOfWheels;
        this->colour=colour;
    }
    void start_engine()
    {
        cout<<"Motorcycle engine is strated"<<endl;
    }
    void displayInfo()
    {
         Vehicle::displayInfo();
        cout<<"No Of Wheels: "<<noOfWheels<<endl;
        cout<<"Motorcycle color: "<<colour<<endl;
    }

};
class Truck: public Vehicle{
    private:
    int noOfWheels;
    string colour;

    public:
    Truck(string name,int speed,int noOfWheels=0,string colour="\0"):Vehicle(name,speed)
    {  
        this->noOfWheels=noOfWheels;
        this->colour=colour;
    }
    void start_engine()
    {
        cout<<"Truck engine is strated"<<endl;
    }
    void displayInfo()
    {
        Vehicle::displayInfo();
        cout<<"No Of Wheels: "<<noOfWheels<<endl;
        cout<<"Truck color: "<<colour<<endl;
    }

};
int main()
{

    Car c("Wagnor",100,4,"NavyBlue");
    c.displayInfo();
    c.start_engine();

    Motorcycle m("Honda",50,2,"Silver");
    m.displayInfo();
    m.start_engine();

    Truck t("Bajaj",120,8,"Red");
    t.displayInfo();
    t.start_engine();

    return 0;
}