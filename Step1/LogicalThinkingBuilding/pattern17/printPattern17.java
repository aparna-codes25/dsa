package learn.pattern17;

import java.util.Scanner;

/*

Pattern 17:

   A
  ABA
 ABCBA
ABCDCBA

 */

public class printPattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution17 sol = new Solution17();
        int n = sc.nextInt();
        sc.nextLine();
        sol.pattern17(n);
    }
}
