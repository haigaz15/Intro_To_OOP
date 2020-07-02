#include <iostream>
#include <string>
using namespace std;
double* fillUp(double* a) {
		for (int i = 0; i < 7; i++) {
			cin >> a[i];
	    }
		return a;
}
int printer(double a[], int size) {
	cout << "the tempretures are ";
	for (int i = 0; i < size; i++) {
		 cout << a[i] << " ";
	}
	double sum = 0;
	double average;
	for (int i = 0; i < 7; i++) {
		sum = sum + a[i];
	}
	average = sum / 7;
	cout <<" the average is: "<< average << " " ;
	return 0;
}

double* convertor(double* a, int size) {
	for (int i = 0; i < size; i++) {
		a[i] = (a[i] * 1.8) + 32;
	}
	return a;
}
int main() {
	int numOfWeeks;
	cout << "Enter number of weeks ";
	cin >> numOfWeeks;
	double a[7];
	for (int i = 0; i < numOfWeeks; i++) {
	    printer(convertor(fillUp(a),7),7);
	}
	system("pause");
	return 0;
}