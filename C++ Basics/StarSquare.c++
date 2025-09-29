/*

* * * * *
* * * * *
* * * * *
* * * * *

*/

#include<iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter a number : ";
    cin >> n;
    cout << "Pattern for given number: \n";
    for(int i = 1; i <= n; i++) {
        for(int j = 0; j <= n; j++) cout << " * ";
        cout << "\n";
    }

    return 0;
}