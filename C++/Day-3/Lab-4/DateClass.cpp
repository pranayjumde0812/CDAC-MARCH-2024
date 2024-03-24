// 2. Create a class Date with data members as dd, mm, yy. Write getters and setters for all the data members.
//  Also add the display function. Create Default and Parameterized constructors.
//  Create the object of this class in main method and invoke all the methods in that class

#include <iostream>
using namespace std;

class Date
{
private:
    int dd, mm, yy;

public:
    Date()
    {
        dd = 1;
        mm = 1;
        yy = 1999;
    }

    Date(int dd, int mm, int yy)
    {
        this->dd = dd;
        this->mm = mm;
        this->yy = yy;
    }

    void setDd(int dd)
    {
        this->dd = dd;
    }
    void setMm(int mm)
    {
        this->mm = mm;
    }
    void setYy(int yy)
    {
        this->yy = yy;
    }

    int getDd()
    {
        return dd;
    }
    int getMm()
    {
        return mm;
    }
    int getYy()
    {
        return yy;
    }
};

int main()
{
    cout << "Using default construcor" << endl;
    Date date;
    date.setDd(2);
    date.setMm(12);
    date.setYy(1988);

    cout << "Day = " << date.getDd() << ", Month = " << date.getMm() << ", Year = " << date.getYy() << endl;

}
