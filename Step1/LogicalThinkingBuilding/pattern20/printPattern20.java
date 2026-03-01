package learn.pattern20;

import java.util.Scanner;
/*
Pattern 20:

*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *


 */

public class printPattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution20 sol = new Solution20();
        int n = sc.nextInt();
        sc.nextLine();
        sol.pattern20(n);
    }
}
