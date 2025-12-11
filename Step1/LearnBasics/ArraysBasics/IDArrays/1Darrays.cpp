#include<iostream>
using namespace std;

int main(){
    int n;
    cin >> n;

    double arr[n];
    // stores elements of same datatype
    // double arr[n];
    // long arr[n]; .. are other valid arr declarations\
    // index 0,1,... n-1;
    // stored in contiguous memory location
    // the starting memory location is random, but other memory location
    // of other elements is consecutive or relative to the starting memory location

    for(int i = 0;i<n;i++){
        cin >> arr[i]; 
    }

    for(int i = 0;i<n;i++){
        if(i == 3) {
             arr[i] = 7.7;
             // if we store double but it is int arr then
             // it trims the number and stores only the integer part of it
        }

        // performing operations on individual elements
        arr[i] += 10;
        cout << arr[i] << "\n";
    }
    return 0;
}