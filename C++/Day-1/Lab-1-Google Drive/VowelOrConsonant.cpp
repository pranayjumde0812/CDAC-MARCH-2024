//7. Accept a lowercase character from the user and check whether the character is a vowel or consonant. 
//(Hint: a, e, i, o, u are vowels)

#include<iostream>
using namespace std;

int main(){
	
	char ch;
	
	bool isVowel;
	cout<<"enter lowercase character "<<endl;
	cin>>ch;
	
	isVowel = ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' );
	
	if(isVowel){
		cout<<"Entered character is Vowel."<<endl;
	}else{
		cout<<"Entered character is Consonant."<<endl;
	}
	
	return 0;
}
