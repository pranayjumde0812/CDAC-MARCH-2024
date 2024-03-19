#include<iostream>
#include<fstream>

using namespace std;

int main() {
    string filename;
    cout << "Enter filename: ";
    getline(cin, filename);
    
    ofstream fout;
    fout.open(filename.c_str(), ios :: out | ios::app);
    
    
    
    if(fout.fail()) {
        cout << "Failed to open file." << endl;
    }
    else {
    	char ch;
   
    	do{
    		string data;
    		cout << "Write data to file." << endl;
    		getline(cin,data);
            fout << data << endl;
            cout << "Do you want to continue : (Y)" << endl;
            cin>>ch;
		}while(ch == 'Y');
        
        fout.close(); // Close the file after writing
    }
    
    return 0;
}

