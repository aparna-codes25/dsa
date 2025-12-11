#include<iostream>
using namespace std;

// Write a problem to take age as input
// and deterimine if the person is adult or not
// >= 18, yes
// < 18 , no

int main(){
    int age;
    cin>>age;
    if(age >= 18) {
        cout << "You're an adult";
    }

    // having if -> not required to have an else statment
    else if(age < 10) {
        cout << "You're not an adult";
    }

    return 0;
}