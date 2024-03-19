#include <bits/stdc++.h>
#include"Book.h"

using namespace std;

int main()
{
    int ch;
    int id;
    char *filename;
    char nm[20], auth[20];
    Book b1;
    cout << "1 :add book  2:display book 3: write book in file 4:read from file 0:exit" << endl;
    do
    {

        cout << "enter choice ";
        cin >> ch;
        switch (ch)
        {
        case 1:
            cout << "id name author " << endl;
            cin >> id >> nm >> auth;
            b1.accept(id, nm, auth);
            break;
        case 2:
            b1.display();
            break;
        case 3:
            // to store book obj into file accept filename
            cout << "enter file name ";
            cin >> filename;
            writeBook(filename, b1);
            break;
        case 4:
            cout << "enter file name ";
            cin >> filename;
            readBook(filename,b1);
            break;
        case 5:
            break;
        }
    } while (ch != 0);
}