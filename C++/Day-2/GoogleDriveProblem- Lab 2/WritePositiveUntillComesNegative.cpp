// 1:Write a program that accepts numbers continuously as long as the number is positive and prints the
// sum of the given numbers.

#include <iostream>
using namespace std;

int main() {
    int num, sum = 0;
    cout << "Enter numbers (negative number to terminate):\n";

    while (true) {
        cin >> num;
        if (num < 0) {
            break;
        }
        sum += num;
    }

    cout << "Sum of the given numbers: " << sum << endl;

    return 0;
}
