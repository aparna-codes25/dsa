package learn.pattern20;

public class Solution20 {
    public void pattern20(int n){
        for(int i = 1;i<=n;i++){
            int spaces = 2 * (n-i);
            // printing left side row stars
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }

            // printing spaces
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }

            // printing right side stars
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i = n -1 ;i>=1;i--){
            int spaces = 2 * (n-i);
            // printing left side row stars
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }

            // printing spaces
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }

            // printing right side stars
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
