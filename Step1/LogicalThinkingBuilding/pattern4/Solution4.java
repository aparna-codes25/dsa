package learn.pattern4;

public class Solution4 {

    public void pattern4(int n){
        // rule 1: Outer loop to print n rows
        for(int i = 1;i<=n;i++){
            // rule 2: Inner loop to print i, i times
            for(int j = 1;j<=i;j++){
                // rule 3: print the pattern in every row
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
