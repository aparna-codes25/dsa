package learn.pattern13;

import java.util.Scanner;

/*

Pattern 13:

1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 */

public class printPattern13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution13 sol = new Solution13();
        int n = sc.nextInt();
        sc.nextLine();
        sol.pattern13(n);
    }
}
