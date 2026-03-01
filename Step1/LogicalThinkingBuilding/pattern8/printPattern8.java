package learn.pattern8;

import java.util.Scanner;

/*
Pattern 8:

*********
 *******
  *****
   ***
    *


 */
public class printPattern8 {
    public static void main(String[] args) {
        Solution8 sol = new Solution8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        sol.pattern8(n);
    }
}
