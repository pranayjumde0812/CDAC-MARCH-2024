/*Animal Hierarchy:
Problem Statement: Create a hierarchy of animal classes. 
Start with a base class Animal and then 
create derived classes like Mammal, Bird, and Fish.
 Each of these derived classes should have specific properties 
 and methods related to their respective categories of animals.
*/

#include<iostream>
using namespace std;

class Animal{
    private:
    string name;
    int leg;
    string survive;
    
    public:
    Animal()
    {
        cout<<"---------Inside def const of Animal----------"<<endl;
        name="default";
        leg=0;
        survive="Earth";

    }

    Animal(string name,int leg,string survive)
    {
        cout<<"---------Inside prameterised const of Animal----------"<<endl;
        this->name=name;
        this->leg=leg;
        this->survive=survive;
    }

    void displayInfo()
    {
        cout<<"Name: "<<this->name<<endl;
        cout<<"No.of legs: "<<this->leg<<endl;
        cout<<"Survival info: "<<this->survive<<endl;
    }
};

class Mammal:public Animal
{

    private:
       string food;
    
    public:
       Mammal()
       {
        cout<<"-----Inside def const of Mammels class-------"<<endl;
        food="Green grass";
       }

       Mammal(string name,int leg,string survive,string food):Animal(name,leg,survive)
       {
        cout<<"-----Inside parameterised const of Mammels class-------"<<endl;
        this->food= food;
       }
       
       void Walking()
       {
        cout<<"Mammels are terrestial animals"<<endl;
       }
       void displayFood()
       {
        cout<<"Food: "<<this->food<<endl;
       }
};

class Fish:public Animal
{

    private:
       string food;
    
    public:
       Fish()
       {
        cout<<"-----Inside def const of Fish class-------"<<endl;
        food="default";
       }
       
       Fish(string name,int leg,string survive,string food):Animal(name,leg,survive)
       {
        cout<<"-----Inside parameterised const of Fish class-------"<<endl;
       this->food=food;
       }
       
       void Swimming()
       {
        cout<<"Fish can swim"<<endl;
       }
       void displayFood()
       {
        cout<<"Food: "<<this->food<<endl;
       }
};

class Bird:public Animal
{

    private:
       string food;
    
    public:
       Bird()
       {
        cout<<"-----Inside def const of Mammels class-------"<<endl;
        food="Green grass";
       }

       Bird(string name,int leg,string survive,string food):Animal(name,leg,survive)
       
       {
        cout<<"-----Inside parameterised const of Mammels class-------"<<endl;
        this->food=food;
       }
       
       void Flying()
       {
        cout<<"Birds can fly"<<endl;
       }

       void displayFood()
       {
        cout<<"Food: "<<food;
       }
};


int main()
{
    cout<<"*******************Animal**********************************"<<endl;
     Animal a1;
     a1.displayInfo();
    Animal a2("Horse",4,"stable");
     a2.displayInfo();

    cout<<"*******************Mammmal**********************************"<<endl;
    Mammal m1;
    m1.displayInfo();
    Mammal m2("Human",2,"House","fast food");
    m2.displayInfo();
    m2. Walking();
    m2.displayFood();

    cout<<"*******************Fish**********************************"<<endl;  
    Fish f1;
    f1.displayInfo();
    Fish f2("Dolphine",0,"Sea","Seafood");
    f2.displayInfo();
    f2.Swimming();
    f2.displayFood();
       

    Bird b1;
    b1.displayInfo();
    Bird b2("Parrot",2,"tree","guava");
    b2.displayInfo();
    b2.Flying();
    b2.displayFood();
       



    return 0;
}