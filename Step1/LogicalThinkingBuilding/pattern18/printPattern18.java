package learn.pattern18;

import java.util.Scanner;

/*
Pattern 18:

E
DE
CDE
BCDE
ABCDE

 */

public class printPattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution18 sol = new Solution18();
        int n = sc.nextInt();
        sc.nextLine();
        sol.pattern18(n);
    }
}
