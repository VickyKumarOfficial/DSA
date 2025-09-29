/*

*
* *
* * *
* * * *
* * * * *

*/

#include<iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter a number : ";
    cin >> n;
    cout << "The patter for given rows and col are: %d" << n;
    for(int i = 0; i <= n; i++) {
        for(int j = 1; j <= i; j++) cout << " * ";
        cout << "\n";
    }

    return 0;
}