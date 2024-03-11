// Animal Hierarchy:
// Problem Statement: Create a hierarchy of animal classes.
// Start with a base class Animal and then create derived classes like Mammal,
//  Bird, and Fish. Each of these derived classes should have specific properties and
// methods related to their respective categories of animals.
#include <iostream>
#include "Animal.h"
#include <string.h>
using namespace std;
class Mammal : public Animal
{
private:
    string feature;

public:
    Mammal(string feature, string type) : Animal(type)
    {

        cout << "enter the features of mammal:\n";
        this->feature = feature;
    };
    void print()
    {
        cout << "\nmammals can " << feature;
    }
    ~Mammal()
    {
        cout << "";
    };
};
class Bird : public Animal
{
private:
    string feature;

public:
    Bird(string feature, string type) : Animal(type)
    {
        cout << "enter the features of bird:\n";
        this->feature = feature;
    };
    void print()
    {
        cout << "birds can " << feature;
    }
    ~Bird()
    {
        cout << "";
    };
};
class Fish : public Animal
{
private:
    string feature;

public:
    Fish(string feature, string type) : Animal(type)
    {
        cout << "enter the features of fish:\n";
        this->feature = feature;
    };
    void print()
    {
        cout << "fish can " << feature;
    }
    ~Fish()
    {
        cout << "";
    };
};

int main()
{
    string feature, type;
    cin >> type;
    cout<<endl;
    getline(cin, feature);
    Mammal m1(feature, type);
    m1.print();

// cout<<endl;
//     cin >> type;
//     getline(cin, feature);
//     Bird b1(feature, type);
//     b1.print();

// cout<<endl;
//     cin >> type;
//     getline(cin, feature);
//     Fish f1(feature, type);
//     f1.print();

    return 0;
}