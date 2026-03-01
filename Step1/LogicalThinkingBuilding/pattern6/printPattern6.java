package learn.pattern6;

import java.util.Scanner;
/*
Pattern 6:

12345
1234
123
12
1

 */

public class printPattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Solution6 sol = new Solution6();
        sol.pattern5(n);
    }
}