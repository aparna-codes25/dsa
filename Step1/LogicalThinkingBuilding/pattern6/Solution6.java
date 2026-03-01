package learn.pattern6;

public class Solution6 {

    public void pattern5(int n){
        // rule 1: Outer loop to print n rows
        for(int i = n; i>= 1;i--){
            // rule 2: Inner loop to print the rows
            for(int j = 1;j<=i;j++){
                // rule 3: print the row of the pattern
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
