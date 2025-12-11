#include<iostream>
using namespace std;

int main(){

    int n;
    int m;

    cin >> n;
    cin >> m;

    // n - number of rows
    // m - number of columns

    int arr[n][m];

    arr[1][3] = 3;
    cout << arr[1][2];
    // This will return a garbage value as the system initialises it with
    // some random / garbage value
    // The only element initialised is arr[1][3]
    // every execution of this line returns a new number not the same every time

    return 0;
}
