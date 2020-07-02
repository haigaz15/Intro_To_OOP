#include <iostream>
using namespace std;
int main() {
	int n;
	int sum = 0;
	cout << "Enter your number: " << endl;
	cin >> n;
		for (int i = 2; i < n; i++) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		cout << "The sum is: " << sum << endl;
		system("pause");
		return 0;
}
// largest value for n if it is int is: 2147483647
// largesr value for n if it is unsigned int : 2,147,483,647