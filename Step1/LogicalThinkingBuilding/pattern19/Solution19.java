package learn.pattern19;

public class Solution19 {

    public void pattern19(int n){

        int spaces = 0;
        for(int i = n;i>=1;i--){
            spaces = 2 * (n-i);

            // print left side row stars
            for(int j = 0;j<i;j++){
                System.out.print("*");
            }
            // print in between spaces
            for(int j = 0;j<spaces;j++){
                System.out.print(" ");
            }

            // print right side row stars
            for(int j = 0;j<i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

        // Now print inversion of above pattern
        for(int i = 1;i<=n;i++){
            spaces = 2 * (n-i);

            // print left side row stars
            for(int j = 0;j<i;j++){
                System.out.print("*");
            }
            // print in between spaces
            for(int j = 0;j<spaces;j++){
                System.out.print(" ");
            }

            // print right side row stars
            for(int j = 0;j<i;j++){
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
