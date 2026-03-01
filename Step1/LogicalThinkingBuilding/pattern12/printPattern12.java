package learn.pattern12;

import java.util.Scanner;

/*
Pattern 12:

1      1
12    21
123  321
12344321

 */

public class printPattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Solution12 sol = new Solution12();
        sol.pattern12(n);
    }
}
