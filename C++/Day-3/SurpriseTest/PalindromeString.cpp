#include <iostream>
#include <string>

using namespace std;

bool isPalindrome(string& str) {
    int length = str.length();
    
    
    for (int i = 0; i < length / 2; ++i) {
        if (str[i] != str[length - i - 1]) {
            
            return false;
        }
    }
   
    return true;
}

int main() {
    string input;
    
    cout << "Enter a string: ";
    getline(cin, input);
    
    if (isPalindrome(input)) {
        cout << "The string is a palindrome." << endl;
    } else {
        cout << "The string is not a palindrome." << endl;
    }
    
    return 0;
}

