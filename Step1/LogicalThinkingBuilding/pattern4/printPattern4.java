package learn.pattern4;

import java.util.Scanner;
/*
Pattern 4:

1
22
333
4444
55555
666666

 */

public class printPattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Solution4 sol = new Solution4();
        sol.pattern4(n);
    }
}