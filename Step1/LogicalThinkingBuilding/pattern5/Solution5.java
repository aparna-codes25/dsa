package learn.pattern5;

public class Solution5 {

    public void pattern5(int n){
        // rule 1: outer loop to print n rows
        for(int i = n;i>=1;i--){
            // rule 2: inner loop to print *
            for(int j = 1;j<=i;j++) {
                // rule 3: print *
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
