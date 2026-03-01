package learn.pattern7;

import java.util.Scanner;

/*
Pattern 7:

    *
   ***
  *****
 *******
*********

 */

public class printPattern7 {
    public static void main(String[] args) {
        Solution7 sol = new Solution7();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        sol.pattern7(n);
    }
}
