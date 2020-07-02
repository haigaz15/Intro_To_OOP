#include <iostream>
using namespace std;
struct Circle {
	const double pie = 3.14;
	int radius;
	Circle(int r){
		radius = r;
	}
	void circumferance(int r);
	void area(int r);
};
int main() {
	int radius;
	cout << "Enter your radius: " << endl;
	cin >> radius;
	Circle circle(radius);
	circle.area(radius);
	cout << endl;
	circle.circumferance(radius);
	system("pause");
	return 0;
}
void Circle::circumferance(int r) {
	cout<< "The Area is: " << 2 * (Circle::pie)*r;
}
void Circle::area(int r) {
	cout << "The Circumferance is: "<< (Circle::pie)*(r*r);
}