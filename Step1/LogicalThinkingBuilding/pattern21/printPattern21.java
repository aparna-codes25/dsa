package learn.pattern21;

import java.util.Scanner;

/*

Pattern 21:

****
*  *
*  *
****

 */
public class printPattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution21 sol = new Solution21();
        int n = sc.nextInt();
        sc.nextLine();
        sol.pattern21(n);
    }
}
