#include "Polynomial.h"
#include <iostream>
#include<math.h>
using namespace std;

int main() {
	Polynomial poly1;
	Polynomial poly2;
	cout << "input the degree for the first polynomial: " << endl;
	poly1.readFromConsoleTheDegree();
	cout << "input the coefficients for the first polynomial: " << endl;
	poly1.readFromConsole();
	cout << "input the x-s for the first polynomial: " << endl;
	int poly1Value = poly1.calculateValue();
	cout << "input the degree for the second polynomial: " << endl;
	poly2.readFromConsoleTheDegree();
	cout << "input the coefficients for the second polynomial: " << endl;
	poly2.readFromConsole();
	cout << "input the x-s for the second polynomial: " << endl;
	int poly2Value = poly2.calculateValue();
	cout << "sum of the first and second polynomials: " << poly1Value + poly2Value << endl;
	cout << "multiplication of the first and second polynomials " << poly1Value * poly2Value << endl;
	cout << "first polynomial minus the second polynomial: " << poly1Value - poly2Value << endl;
	cout << "second polynomial minus the first polynomial: " << poly2Value - poly1Value << endl;
	return 0;
}