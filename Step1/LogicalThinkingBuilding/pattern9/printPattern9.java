package learn.pattern9;

import java.util.Scanner;

/*
Pattern 9:

    *
   ***
  *****
 *******
*********
*********
 *******
  *****
   ***
    *

 */

public class printPattern9 {
    public static void main(String[] args) {
        Solution9 sol = new Solution9();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        sol.pattern9(n);
    }
}
