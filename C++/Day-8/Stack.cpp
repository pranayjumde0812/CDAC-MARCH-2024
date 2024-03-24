
// assignment:Exception
// create Stack class  for storing 10 numbers
// create function push(int number)--->number will get stored in array
// create function pop() will return top most number ,last added number

// Note:Hadle StackFull and StackEmpty Exception
// Stack s;//array[4];
// s.push(10);s.push(20);s.push(30);//s.push(40); s.push(50);

// int a=s.pop();//------> 30
//   a=s.pop();//----->20
//    a=s.pop();//------>10

// s.pop();//

#include <iostream>
#include <string.h>
using namespace std;
class StackException
{
    // private:
public:
    string message;
    StackException(string message)
    {
        this->message = message;
    }
};

static int counter;
class Stack1
{
private:
    int arr[3];

public:
    void push(int number)
    {
        int size = sizeof(arr) / 4;
        if (size == counter)
        {
            throw new StackException("stack is full");
        }
        arr[counter] = number;
        counter++;
    }

    int pop()
    {
        if (counter == 0)
        {
            // cout << "\nstack is empty";
            throw new StackException("stack is empty");
        }
        int num = arr[counter - 1];
        arr[counter--];
        return num;
    }
    void print()
    {
        for (int i = 0; i < counter; i++)
        {
            cout << arr[i] << " ";
        }
        cout << endl;
    }
};

int main()

{
    cout << "enter the choice: "<<endl;
    int ch, num;
    string error;
    Stack1 s;
    do
    {
        cout<<"1. push"<<endl;
        cout<<"2. pop"<<endl;
        cout<<"3. display"<<endl;
        cin >> ch;

        switch (ch)
        {
        case 1:
            try
            {
                cout << "\nenter the number to be pushed: ";
                cin >> num;
                s.push(num);
            }
            catch (StackException *obj)
            {
                cout << "\nException " << obj->message << endl;
            }
                break;
            case 3:
                s.print();
                break;
            case 2:
            try
            {                
                cout << "\npopped element: "<<s.pop()<<endl;
            }
            catch (StackException *obj)
            {
                cout << "\nException " << obj->message << endl;
            }
                break;
   
        }
    } while (ch != 0);
    // try
    // {
    // // exception for pop
    // Stack1 s;
    // s.push(10);

    // s.print();
    // cout << "\npop: " << s.pop() << endl;

    // s.print();
    // cout << "\npop: " << s.pop() << endl;

    //     cout << "\n------------------\n";
    //     cout << "push exception\n";
    //     Stack1 s;
    //     s.push(10);
    //     s.push(9);
    //     s.push(8);
    //     s.push(7);
    //     s.push(6);

    //     s.print();
    //     s.push(5);
    //     s.push(4);
    //     s.push(3);
    //     s.push(2);
    //     s.push(1);
    //     s.push(0);
    // }
    // catch (StackException *obj)
    // {
    //     cout << " Exception " << obj->message << endl;
    // }
    // return 0;
}

