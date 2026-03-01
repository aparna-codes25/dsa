package learn.pattern19;

import java.util.Scanner;
/*

Pattern 19:

**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********

 */

public class printPattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution19 sol = new Solution19();
        int n = sc.nextInt();
        sc.nextLine();
        sol.pattern19(n);
    }
}
