package learn.pattern3;

public class Solution3 {
    public void pattern3(int n){
        // rule 1: Outer loop for n rows
        for(int i = 1;i<=n;i++){
            // rule 2: Inner loop to print numbers from 1 ... i
            for(int j = 1;j<=i;j++){
                // rule 3: print j
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
