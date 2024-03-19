#include <iostream>
#include <string.h>
#include <fstream>
// library mgmt API
using namespace std;
namespace Library
{

	class Book
	{

		int bookid;
		char name[20], author[20];

	public:
		void accept(int id, char *nm, char *ath)
		{
			bookid = id;
			strcpy(this->name, nm);
			strcpy(author, ath);
			cout << "----book created----" << endl;
		}
		void display()
		{
			cout << bookid << "    " << name << "    " << author << endl;
		}
	};
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
	void readBook(string name)
	{
		Book b2;
		ifstream input(name, ios::binary);
		while (input.read((char *)&b2, sizeof(Book)))
		{

			b2.display();
		}
	}
}
