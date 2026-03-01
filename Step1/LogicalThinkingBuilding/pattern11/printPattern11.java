package learn.pattern11;

import java.util.Scanner;

/*
Pattern 11:

1
01
101
0101
10101

 */

public class printPattern11 {
    public static void main(String[] args) {
        Solution11 sol = new Solution11();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        sol.pattern11(n);
    }
}
