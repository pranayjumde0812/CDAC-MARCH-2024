// #include <bits/stdc++.h>
// // #include <iostream>

// using namespace std;

// // Driver Code
// int main()
// {
// 	// Creation of fstream class object
// 	fstream fio;

// 	string line;

// 	// by default openmode = ios::in|ios::out mode
// 	// Automatically overwrites the content of file, To append
// 	// the content, open in ios:app
// 	// fio.open("sample.txt", ios::in|ios::out|ios::app)
// 	// ios::trunc mode delete all content before open
// 	fio.open("sample.txt", ios::trunc | ios::out | ios::in);

// 	// Execute a loop If file successfully Opened
// 	while (fio) {

// 		// Read a Line from standard input
// 		getline(cin, line);

// 		// Press -1 to exit
// 		if (line == "-1")
// 			break;

// 		// Write line in file
// 		fio << line << endl;
// 	}

// 	// Execute a loop until EOF (End of File)
// 	// point read pointer at beginning of file
// 	fio.seekg(0, ios::beg);

// 	while (fio) {

// 		// Read a Line from File
// 		getline(fio, line);

// 		// Print line in Console
// 		cout << line << endl;
// 	}

// 	// Close the file
// 	fio.close();

// 	return 0;
// }

// Q: write a single file handling program in c++ to reading and writing data on a file.

#include<iostream>
#include<fstream>

using namespace std;
main()
{
	int rno,fee;
	char name[50];

	// cout<<"Enter the Roll Number:";
	// cin>>rno;
	
	// cout<<"\nEnter the Name:";
	// cin>>name;
	
	// cout<<"\nEnter the Fee:";
	// cin>>fee;

	// ofstream fout("sample.txt");

	// fout<<rno<<"\t"<<name<<"\t"<<fee; //write data to the file student

	// fout.close();

	ifstream fin("sample.txt");

	fin>>rno>>name>>fee; //read data from the file student

	fin.close();

	//cout<<endl<<rno<<"\t"<<name<<"\t"<<fee;

	return 0; 
}