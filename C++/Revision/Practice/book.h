#include <bits/stdc++.h>
using namespace std;
class Book
{
private:
int id;
    string name, author;

public:
    // Book(string name,string author,int cost){
    //     this->name = name;
    //     this->author= author;
    //     this->cost = cost;
    // };
    void accept(int id,string name, string author)
    {
        this->name = name;
        this->author = author;
        this->id = id;
        cout << "----book created----" << endl;
    }
    void display()
    {
        cout << id<< "    " << name << "    " << author << "    "  << endl;
    };
~Book()
    {
    };

   
};
void readBook(string name, Book &b2)
{
    // Book b2;
    ifstream input(name, ios::binary);
    input.read((char *)&b2, sizeof(Book));
    while (!input.eof())
    {

        b2.display();
        input.read((char *)&b2, sizeof(Book));
    }
}
void writeBook(string filename, Book &b1)
{

    // ifstream--->read
    // ofstream---write
    // fstream ---->read/write   ios::out ios::binary

    ofstream obj;
    obj.open(filename, ios::binary | ios::app); // open file in append mode
    cout << sizeof(Book);
    obj.write((char *)&b1, sizeof(Book));
    obj.close();
    cout << "-----book get stored in file -----" << endl;
}
    