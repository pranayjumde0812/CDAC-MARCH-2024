// 4. Create a class Book with data members as bname,id,author,price. Write getters and setters for all the
// data members. Also add the display function. Create Default and Parameterized constructors. Create
// the object of this class in main method and invoke all the methods in that class.
#include <bits/stdc++.h>
using namespace std;
class Book
{
private:
    string bname, author;
    int id;
    double price;

public:
    Book()
    {
        id = 0;
        bname = author = "NaN";
        price = 0;
    }

    Book(int id, string bname, string author, double price)
    {
        this->id = id;
        this->price = price;
        this->bname = bname;
        this->author = author;
    }
    void setId(int id)
    {
        this->id = id;
    }
    void setPrice(double price)
    {
        this->price = price;
    }
    void setBname(string bname)
    {
        this->bname = bname;
    }
    void setAuthor(string author)
    {
        this->author = author;
    }
    int getId()
    {
        return id;
    }
    string getBname()
    {
        return bname;
    }
    string getAuthor()
    {
        return author;
    }
    double getPrice()
    {
        return price;
    }
    void display()
    {
        cout << "Book: " << getId() << "\n"
             << getBname() << "\n"
             << getAuthor() << "\n"
             << getPrice() << endl;
    }
};
int main()
{
    cout << "\n-------default constr--------\n";
    Book b;
    b.display();

    cout << "\n------parameterized constr---------\n";
    Book b1(1, "aptitude", "rs agrawal", 1000);
    b1.display();

    cout << "\n-------getter setter --------\n";
    Book b2;
    b2.setId(2);
    b2.setPrice(5000);
    b2.setBname("JEE Maths");
    b2.setAuthor("SK Goyal");

    b2.display();
    return 0;
}
