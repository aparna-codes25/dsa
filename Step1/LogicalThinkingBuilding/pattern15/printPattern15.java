package learn.pattern15;

import java.util.Scanner;

/*

Pattern 15:

ABCDE
ABCD
ABC
AB
A

 */

public class printPattern15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution15 sol = new Solution15();
        int n = sc.nextInt();
        sc.nextLine();
        sol.pattern15(n);
    }
}
