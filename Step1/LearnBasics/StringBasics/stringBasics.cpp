#include<iostream>
using namespace std;

int main(){
    string s = "Aparna";
    // indexing of string : 0,1, ... length of string -1;
    int len = s.size(); 
    // function to find length of string

    cout << s[1];
    cout << s[len - 1]; // Last character of string
    cout << s[len]; // undefined behavior - not a valid character
    // s[len] - out of bound access
    return 0;
}