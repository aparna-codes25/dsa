package learn.pattern3;

import java.util.Scanner;
/*
Pattern 3:

1
12
123
1234
12345

 */

public class printPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Solution3 sol = new Solution3();
        sol.pattern3(n);
    }
}
