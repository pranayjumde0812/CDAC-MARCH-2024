#include<iostream>
#include<string.h>
#include<fstream>
using namespace std;
class Student{
	int rollno;
	char name[20],city[20];
	public : 
	void accept(int rollno,char* name,char* city){
		this->rollno=rollno;
		strcpy(this->name, name);
		strcpy(this->city, city);
		cout<<"Student created------"<<endl;
	}
	void display()
	{
		cout<<"Rollno  "<<rollno<<" Name:  "<<name <<" City:  "<<city<<endl;
	}
};
//accept filename  
//accept student:rollno name city
void writeStudent(string filename ,Student &studObj)
{
cout<<"----This  will store Student Object Into File ---"<<filename<<endl;

    fstream writeStud(filename,ios::out|ios::binary);
//try to find out o/p of sizeof(Student)

    writeStud.write((char*)&studObj,sizeof(Student));
	cout<<"Data written in file "<<endl;
	writeStud.close();
}
 void readStudent(string filename)
 {
 	Student s2;
 	fstream readStud (filename,ios::in|ios::binary);
 	readStud.read((char*)&s2,sizeof(Student));
	  
	  s2.display();
	  
 	readStud.close();
 }
 
 void readFile()
 {
 	ifstream input("info.txt");
 	string data;
 	while(getline(input,data))
 	{
 		cout<<data<<endl;
	 }
 	
 }
 
 
int main()
{
 
 
 cout<<"1 create student 2:display student 3:exit"<<endl;
 int ch;
 string filename;
 char name[20],city[20];
 int rollno;
 Student s1,s2;//default
 do{
 cout<<"enter choice "<<endl;
 cin>>ch;
 switch(ch)
 {
 	case 1:cout<<"Roll name city";
       	cin>>rollno>>name>>city;
 	      s1.accept(rollno,name,city);
	      break;
 	case 2:s1.display();
	       break;
 	case 3:cout<<"Enter name of file  ";
 			cin>>filename;
	     	writeStudent(filename,s1);
	  case 4:cout<<"Enter name of file  ";
 			cin>>filename;
	      cout<<"get Student from file  "<<endl;
	       readStudent(filename);
	 break;
 	case 5:break;
	 }	
 	
 }while(ch!=10);
 //case 1:
 
 
 
	
}




