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
    for(int i = 1; i <= n; i++) {
        for(int j = n-i; j >= 0; j--) cout << " * ";
        cout << "\n";
    }
/*
    * * * * *
    * * * *
    * * * 
    * * 
    *
*/
}

void pattern6(int n) {
    for(int i = 0; i < n; i++) {
        for(int j = n-i-1; j > 0; j--) cout << " ";
        for(int k = 0; k < (2*i)+1; k++) cout << "*";
        for(int l = n-i-1; l > 0; l--) cout << " ";
        cout << "\n";
    }
/*
            *
          * * *
        * * * * * 
      * * * * * * *
    * * * * * * * * *
*/
}

void pattern7(int n) {
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < i; j++) cout << " ";
        for(int k = ((2*n) - ((2*i)+1)); k > 0; k--) cout << "*";
        for(int l = 0; l < i; l++) cout << " ";
        cout << "\n";
    }
/*
    * * * * * * * * *
      * * * * * * *
        * * * * *
          * * *
            *
*/
}

void pattern8(int n) {
    // It can be divide into - upper & lower halfs of pyramid.
    // So, Print 1st -> upper then 2nd -> lower
    
    // Upper half
    for(int i = 0; i < n; i++) {
        for(int j = n-i-1; j > 0; j--) cout << " ";
        for(int k = (2*i) + 1; k > 0; k--) cout << "*";
        for(int l = n-i-1; l > 0; l--) cout << " ";
        cout << "\n";
    }
    
    // Lower half
    for(int i = 1; i < n; i++) {
        for(int j = 0; j < i; j++) cout << " ";
        for(int k = ((2*n) - ((2*i)+1)); k > 0; k--) cout << "*";
        for(int l = 0; l < i; l++) cout << " ";
        cout << "\n";
    }

/*
            *
          * * *
        * * * * * 
      * * * * * * *
    * * * * * * * * *
      * * * * * * *
        * * * * *
          * * *
            *
*/
}

void pattern9(int n) {
    // Upper Half
    for(int i = 0; i < n; i++) {
        for(int j = 0; j <= i; j++) cout << "* ";
        cout << "\n";
    }
    // Lower Half
    for(int i = n-1; i > 0; i--) {
        for(int j = i; j > 0; j--) cout << "* ";
        cout << "\n";
    }

/*
    * 
    * *
    * * *
    * * * * 
    * * * * * 
    * * * * 
    * * *
    * *
    * 
*/
}

int main() {
    int n;
    cout << "Enter a number : ";
    cin >> n;
/*
    pattern1(n);
    pattern2(n);
    pattern3(n);
    pattern4(n);
    pattern5(n);
    pattern6(n);
    pattern7(n);
    pattern8(n);
    pattern9(n);
*/
    pattern10(n);
    return 0;
}




