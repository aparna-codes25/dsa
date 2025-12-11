#include<iostream>
using namespace std;

int main(){
    int day;
    cin >> day;

    switch(day) {
        case 1:
            cout << "Monday";
            break;
        case 2:
            cout << "Tuesday";
            break;
        case 3:
            cout << "Wednesday";
            break;
        case 4:
            cout << "Thursday";
            break;
        case 5: 
            cout << "Friday";
            break;
        case 6:
            cout << "Saturday";
            break; // breaks out of all conditional statements
            // break statements are essential. Without that the correct case
            // as well as the subsequent cases are also execueted. 
        case 7:
            cout << "Sunday";
            break;
        default:
            cout << "Invalid number";
            break;
            // default block is executed when no case statements satisfy the value
        // if I don't give break here:
        // for i/p: 19, default block is executed and then this cout also
    
        cout << "\nCheck inside switch";

    }
    // this cout is always execueted
    cout << "\nCheck outside switch";
    return 0;
}