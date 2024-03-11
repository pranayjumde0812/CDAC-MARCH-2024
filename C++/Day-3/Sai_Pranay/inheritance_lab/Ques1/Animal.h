#include <iostream>
#include <string.h>
using namespace std;
class Animal
{
private:
    string type;

public:
    Animal(string type)
    {
        this->type = type;
        cout << type << " breathes air\n";
        cout << type << " eats food\n";
    };

    ~Animal()
    {
        cout << "";
    };
};
