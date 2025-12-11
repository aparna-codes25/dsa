#include<iostream>
using namespace std;

int main(){
    int age;
    cin >> age;

    if(age < 18){
        cout << "Not eligible for Job";
    }

    // else if(age < 55){
    //     cout<< "Eligible for job";
    // }

    // else if(age <= 57){
    //     cout << "Eligible for Job, but retirement soon.";
    // }

    // else {
    //     cout << "Retirement age.";
    // }
    // using nested if-else

    if(age <= 57){
        cout << "Eligible for Job, ";

        if(age >= 55){
            cout << "but retirement soon.";
        }
    }

    else{
        cout << "Retirement time.";
    }

    return 0;
}