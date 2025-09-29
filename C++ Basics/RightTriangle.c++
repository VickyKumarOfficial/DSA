#include<iostream>
using namespace std;

void pattern1(int n) {
    for(int i = 0; i <= n; i++) {
        for(int j = 1; j <= i; j++) cout << " * ";
        cout << "\n";
    }
/*
    *
    * *
    * * *
    * * * *
    * * * * *    
*/
}

void pattern2(int n) {
    for(int i = 0; i <= n; i++) {
        for(int j = 1; j <= i; j++) cout << " " << i << " ";
        cout << "\n";
    }
/*
    1
    2 2
    3 3 3 
    4 4 4 4
    5 5 5 5 5
*/
}

void pattern3(int n) {
    int a = 1;
    for(int i = 0; i <= n; i++) {
        for(int j = 1; j <= i; j++) {
            cout << " " << a << " ";
            a++;
        }
        cout << "\n";
    }
/*
    1
    2 3
    4 5 6 
    7 8 9 10 
*/
}

void pattern4(int n) {
    for(int i = 0; i <= n; i++) {
        for(int j = 1; j <= i; j++) cout << " " << j << " ";
        cout << "\n";
    }
/*
    1
    2 2
    3 3 3 
    4 4 4 4
    5 5 5 5 5
*/
}

void pattern5(int n) {
    for(int i = 0; i <= n; i++) {
        for(int j = n-i-1; j >= 0; j--) cout << " ";
        for(int k = 1; k <= (2*i)+1; k++) cout << "*";
        for(int l = n-i-1; l >= 0; l--) cout << " ";
        cout << "\n";
    }
/*
          *
        * * *
       * * * * 
     * * * * * *
   * * * * * * * *
*/
}

int main() {
    int n;
    cout << "Enter a number : ";
    cin >> n;
    pattern1(n);
    pattern2(n);
    pattern3(n);
    pattern4(n);
    pattern5(n);
    return 0;
}




