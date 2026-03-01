package learn.pattern14;

import java.util.Scanner;

/*

Pattern 14:

A
AB
ABC
ABCD
ABCDE

 */

public class printPattern14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution14 sol = new Solution14();
        int n = sc.nextInt();
        sc.nextLine();
        sol.pattern14(n);
    }
}
