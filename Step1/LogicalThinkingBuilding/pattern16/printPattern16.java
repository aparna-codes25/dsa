package learn.pattern16;

import java.util.Scanner;
/*

Pattern 16:

A
BB
CCC
DDDD
EEEEE

 */
public class printPattern16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution16 sol = new Solution16();
        int n = sc.nextInt();
        sc.nextLine();
        sol.pattern16(n);
    }
}
