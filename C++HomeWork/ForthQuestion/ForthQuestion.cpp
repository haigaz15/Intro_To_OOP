#include <iostream>
using namespace std;
int tripleByValue(int value);
int tripleByReference(int &value);
int main() {
	int count = 10;
	tripleByValue(count);
	cout <<"this is passed by value "<< count <<endl;
	tripleByReference(count);
	cout << "this is passed by reference " << count <<endl;
	system("pause");
	return 0;
}
int tripleByValue(int value) {
	 value = value * 3;
	 cout << value << " the change in the first function \n";
	 return value;
}
int tripleByReference(int &value) {
	return value = value * 3;
}