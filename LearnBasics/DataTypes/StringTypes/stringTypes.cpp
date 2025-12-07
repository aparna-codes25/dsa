#include<bits/stdc++.h>
using namespace std;
int main(){
    /* string s1;
    string s2;
    cin >> s1 >> s2;
    cout << s1 << " " << s2; */

 // String takes characters until a space occurs
 // to get string with spaces we use getline function

    string str;
    getline(cin,str); 
    //it takes whole line with spaces as input
    // give Hey in first line, Aparna in second line, it will print only Hey

    cout << str;
    return 0;
    
}
