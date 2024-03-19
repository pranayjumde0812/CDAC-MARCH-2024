#include <iostream>
#include "MyLibrary.h"
using namespace std;
int main()
{

	Library::Book b1;
	b1.accept(345, "MyBook", "Nisha");
	b1.display();

	Library::writeBook("MyBook.txt", b1);
	Library::readBook("MyBook.txt");
}
