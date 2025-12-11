#include<iostream>
using namespace std;

/*
Pattern 1: 

******
******
******
******
******

*/

int main() {
    int n; // rule 1
    // rule 2 inner row for printing m columns (here n = m)
    cin >> n;

    // rule 2 connect : for every row i, we print n stars

    // for(int i = 0; i< n; i++){
    //     for(int j = 0;j < n;j++){
    //         cout << "* "; // rule 3
    //     }
    //     cout << endl;
    // }

    int i = 0;
    while(i < n){
        int j = 0;
        while(j < n){
            cout << "* ";
            j++;
        }
        cout << endl;
        i++;
    }
    return 0;
}