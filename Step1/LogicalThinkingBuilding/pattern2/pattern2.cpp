#include<iostream>
using namespace std;

void pattern2(int n){
    // rule 1
    for(int i = 0;i<n;i++){
        // rule 2
        // rule 2 connect - for every row i, we print i+1 stars 
        // (assumpton: i starts from 0 and ends at n)
        for(int j = 0;j<i+1;j++){
            cout << "*"; // rule 3
        }
        cout << endl;
    }
}

int main(){
    int t;
    cin >> t;
    int n;

    for(int i = 0;i<t;i++){
        cin >> n;
        pattern2(n);
        cout << "\n";
    }
    return 0;
}