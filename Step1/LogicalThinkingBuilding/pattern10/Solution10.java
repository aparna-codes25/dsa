package learn.pattern10;

public class Solution10 {
    public void pattern10(int n){
        // Part 1: upper left - angle right triangle
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Part 2: lower inverted left - angle right triangle
        for(int i = n-1;i>=1;i--){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
