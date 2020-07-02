#include <iostream>
using namespace std;

class Polynomial {
private:
	int deg;
	int* coefficients;
	int* arr;
public:
	Polynomial();
	Polynomial(Polynomial& other);
	void readFromConsoleTheDegree();
	void readFromConsole();
	int getDegree();
	void setDegree(int val);
	int getACoefficient(int index);
	void setACoefficient(int index, int val);
	int calculateValue();
	Polynomial operator+(Polynomial& other);
	Polynomial operator-(Polynomial& other);
	Polynomial operator=(Polynomial& other);
	Polynomial operator+=(Polynomial& other);
	Polynomial operator-=(Polynomial& other);
	Polynomial operator*=(Polynomial& other);
};

Polynomial::Polynomial() {
}

Polynomial::Polynomial(Polynomial& other) {
	deg = other.deg;
	coefficients = new int[deg];
	for (int i = 0; i < deg; i++) {
		coefficients[i] = other.coefficients[i];
	}
	for (int i = 0; i < deg; i++) {
		arr[i] = other.arr[i];
	}
}

void Polynomial::readFromConsoleTheDegree() {
	cin >> deg;
}

void Polynomial::readFromConsole() {
	coefficients = new int[deg];
	cout << "coefficents: ";
	for (int i = 0; i < deg; i++) {
		cin >> coefficients[i];
	}
}

int Polynomial::getDegree() {
	return deg;
}

void Polynomial::setDegree(int val) {
	deg = val;
}

int Polynomial::getACoefficient(int index) {
	return coefficients[index];
}

void Polynomial::setACoefficient(int index, int val) {
	coefficients[index] = val;
}

int Polynomial::calculateValue() {
	int result = 0;
	arr = new int[deg];
	cout << "x-s: ";
	int power = deg;
	for (int i = 0; i < deg; i++) {
		cin >> arr[i];
		result = result + coefficients[i] * (pow((double)arr[i], power));
		power--;
	}
	return result;
}

Polynomial Polynomial::operator+(Polynomial& other) {
	other.deg = deg;
	for (int i = 0; i < deg; i++) {
		other.coefficients[i] += coefficients[i];
	}
	return other;
}

Polynomial Polynomial::operator-(Polynomial& other) {
	other.deg = deg;
	for (int i = 0; i < deg; i++) {
		other.coefficients[i] -= coefficients[i];
	}
	return other;
}

Polynomial Polynomial::operator=(Polynomial& other) {
	other.deg = deg;
	for (int i = 0; i < deg; i++) {
		other.coefficients[i] = coefficients[i];
	}
	return other;
}

Polynomial Polynomial::operator+=(Polynomial& other) {
	other.deg = deg;
	for (int i = 0; i < deg; i++) {
		other.coefficients[i] = other.coefficients[i] + coefficients[i];
	}
	return other;
}

Polynomial Polynomial::operator-=(Polynomial& other) {
	other.deg = deg;
	for (int i = 0; i < deg; i++) {
		other.coefficients[i] = other.coefficients[i] - coefficients[i];
	}
	return other;
}

Polynomial Polynomial::operator*=(Polynomial& other) {
	other.deg = deg;
	for (int i = 0; i < deg; i++) {
		other.coefficients[i] = other.coefficients[i] * coefficients[i];
	}
	return other;
}