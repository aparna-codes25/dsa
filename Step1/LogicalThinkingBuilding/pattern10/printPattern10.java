package learn.pattern10;

import java.util.Scanner;

/*
Pattern 10:

*
**
***
****
*****
****
***
**
*


 */

public class printPattern10 {
    public static void main(String[] args) {
        Solution10 sol = new Solution10();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        sol.pattern10(n);
    }
}
