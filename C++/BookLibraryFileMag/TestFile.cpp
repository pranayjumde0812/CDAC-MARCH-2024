#include <iostream>
#include <fstream>
using namespace std;

void testOutIn(string name)
{

	//
	// ofstream out(name);//parameter
	// or
	ofstream out;
	out.open(name);

	if (out.fail())
	{
		cout << "---error----" << endl;
	}
	else
	{
		out << "WritingFile   " << endl;
		out.close();
	}
	// read frile using >>
	ifstream input(name);
	if (!input.fail())
	{
		// read from fille using >>
		char data[100];
		input >> data;
		cout << "Data From File " << endl;
		cout << data;
	}
}
void readFile(string name)
{
	// read data from file
	//	ifstream inputFile(name);
	// or
	ifstream inputFile;
	inputFile.open(name);

	if (inputFile.fail())
	{
		cout << "Not Exist ";
	}
	else
	{
		cout << "-----Reading from File-----" << endl;
		string fileData;

		while (getline(inputFile, fileData))
		{
			cout << fileData << endl;
			;
		}
	}
	inputFile.close();
	//
	// Lab:read data from one file and write it into another
}
void writeFile(string name)
{
	// BL
	ofstream fout; // if file not exist it will create
	fout.open(name);
	if (fout.fail())
		cout << "Not exist " << endl;
	else
	{
		char ch;
		string data;
		cout << "done---" << endl;
		cout << "write data into file " << endl;
		// fout.write("This is Data");
		fout << "This is Student Data  " << endl;
		do
		{
			cout << "Enter Data " << endl;
			cin >> data;
			fout << data << "  ";
			cout << "Do You Want To Continue :(Y)" << endl;
			cin >> ch;

		} while (ch == 'Y');
	}
	// ��geate menu driven file io
	// lab: accept data from user and write into file
	// lab:write A-Z into file
	fout.close();
}
int main()
{
	cout << "1:create 2:write file 3:read file  5:using << >> :exit" << endl;
	string name;
	cout << "Enter File Name ";
	cin >> name;
	// writeFile(name);

	//	readFile(name);
	testOutIn(name);

	return 0;
}
