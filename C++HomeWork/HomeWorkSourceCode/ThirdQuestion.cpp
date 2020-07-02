// loop Version
#include <iostream>
using namespace std;
int main() {
	int n;
	int space = 1;
	cin >> n;
	int row = (n / 2) + 1;
    space = row - 1;
	for (int i = 1; i <= row; i++) {
		for (int j = 1; j <= space; j++) {
			cout << " ";
		}
		space--;
		for (int k = 1; k <= (2 * i) - 1; k++) {
			cout << "*";
		}
		cout << endl;
	}
	space = 1;
	for (int i = 1; i <= row - 1; i++) {
		for (int j = 1; j <= space; j++) {
			cout << " ";
		}
		space++;
		for (int k = 1; k <= (2 * (row - i) - 1); k++) {
			cout<<"*";
		}
		cout<<endl;
	}
    	system("pause");
	return 0;
}
// Recursive Version
/*#include <iostream>
using namespace std;

void space(int s) {
	if (s <= 0)
		cout << "";
	else {
		cout << " ";
		space(s - 1);
	}
}

void asterisk(int a) {
	if (a <= 0)
		cout << "";
	else {
		cout << "*";
		asterisk(a - 1);
	}
}
void changer(int s, int a) {
	if (a >= 1) {
		space(s);
		asterisk(a);
		cout << endl;
		changer(s + 1, a - 2);
	}
}

void dimondCreator(int s, int a) {
	if (s >= 0) {
		space(s);
		asterisk(a);
		cout << endl;
		s -= 1;
		a += 2;
		dimondCreator(s, a);
	}
	else {
		s += 2;
		a -= 4;
		changer(s, a);
	}
}

int main() {
	int n, s;
	cin >> n;
	s = n / 2;
	dimondCreator(s, 1);
	system("pause");
	return 0;
}*/