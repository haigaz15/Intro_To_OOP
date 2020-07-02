#include <iostream>
#include <string>
using namespace std;
void calculateFare(int distance, int price[3], int tip[3]) {
	for (int i = 0; i < 3; i++) {
		int x;
		cout << "Enter prices and tips " << endl;
		cin >> x;
		string str;
		cout << "here you enter zero for not tips or any key to continue: ";
		cin >> str;
		if (str.compare("none") == 0) {
			price[i] = x;
			tip[i] = 0;
		}
		else {
			int y;
			cin >> y;
			price[i] = x;
			tip[i] = y;
		}
		cout << "enter your distance " << endl;
		cin >> distance;
		int m = 1;
		int k = 2;
		for (int i = 0; i < 3; i++) {
			if (i = 1) {
				m--;
			}
			if (i = 2) {
				k--;
			}
			//int fare1 = (distance * price[i]) + tip[i];
			//int fare2 = (distance * price[m]) + tip[m];
			//int fare3 = (distance * price[k]) + tip[k];
			if ((distance * price[i]) + tip[i] < (distance * price[m]) + tip[m] && (distance * price[i]) + tip[i]) {
				cout<<" your best fare is : "<< (distance * price[i]) + tip[i]<< endl ;
			}
		}
	}
}

int main() {
	int* x = NULL;
	x = new int[3];
	int* y = NULL;
	y = new int[3];
	int distance = 0;
	calculateFare(distance, x, y);
	system("pause");
	return 0;
}