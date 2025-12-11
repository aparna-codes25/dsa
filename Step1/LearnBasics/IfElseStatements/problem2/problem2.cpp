#include<iostream>

using namespace std;

/*
A school has the following rules for grading system
1. Below 25 - F
2. 25 to 44 - E
3. 45 to 49 - D
4. 50 to 59 - C
5. 60 to 79 - B 
6. 80 to 100 - A
Ask the user to enter marks and print the corresponding grade
*/

int main(){
    int marks;

    cin >> marks;

    if(marks < 25) cout << "F grade";
    // if the marks is not  < 25 then
    // it must be greater than 25 when checking in the next line.
    // so checking else if(marks <= 44) itself is sufficient
    // else if(marks > 25 && marks <= 44) cout << "E grade"; 
    // else if(marks > 44 && marks <= 49) cout << "D grade";
    // else if(marks > 49 && marks <= 59) cout << "C grade";
    // else if(marks > 59 && marks <= 79) cout << "B grade";
    // else if(marks > 79 && marks <= 100) cout << "A grade";

    else if(marks <= 44) cout << "E grade"; 
    else if(marks <= 49) cout << "D grade";
    else if(marks <= 59) cout << "C grade";
    else if(marks <= 79) cout << "B grade";
    else if(marks <= 100) cout << "A grade";
    else cout << "Invalid marks entered";
    cout << "\nMarks value : " << marks;
    return 0;

}