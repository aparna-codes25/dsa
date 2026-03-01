package learn.pattern5;

import java.util.Scanner;

/*
Pattern 5:

*****
****
***
**
*

 */

public class printPattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Solution5 sol = new Solution5();
        sol.pattern5(n);
    }
}
