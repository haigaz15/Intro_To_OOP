#include <iostream>
#include <math.h>  
using namespace std;
int main() {
	cout << "input your number "<<endl;
	int* a = NULL;
	int n;
	cin >> n;
	a = new int[n];
	cout << "input your coefficients " << endl;
	for (int i = 0; i <=n; i++) {
		cin >> a[i];
	}
	int x = 0;
	bool boolean = true;
	int fx = 0;
	cout << "Input your variable : "<<endl;
	cout << "For termnation press anything other than numbers or space and enter: " << endl;
	while (boolean) {
		if ((cin >> x)) {
			boolean = true;
		}
		else {
			return 0;
		}
		for (int j = n; j >= 0; j--) {
			fx = fx + (a[j] * pow(x, j));
		}
		cout << "f(x) = " << fx;
	}
	
}