package learn.pattern22;

import java.util.Scanner;

/*
Pattern 22:

4444444
4333334
4322234
4321234
4322234
4333334
4444444



 */

public class printPattern22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution22 sol = new Solution22();
        int n = sc.nextInt();
        sc.nextLine();
        sol.pattern22(n);
    }
}
