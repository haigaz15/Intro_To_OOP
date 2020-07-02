#include <iostream>
using namespace std;
int main() {
	double pie = 0;
	int number = 4;
	for (int i = 1; i < 1000; i++) {
		for (int j = 1; j <= 1000; j++) {
			if (i % 2 != 0 && j % 2 != 0) {
				pie = pie + static_cast<double>(number) / static_cast<double>(j);
			}
			if (i % 2 == 0 && j % 2 != 0) {
				pie = pie - static_cast<double>(number) / static_cast<double>(j);
			}
		}
	}
	cout << "Pie = " << pie << endl;
	system("pause");
	return 0;
}
