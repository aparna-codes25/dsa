package learn.pattern21;

public class Solution21 {
    public void pattern21(int n){

        int spaces = n-2;
        for(int i = 1; i<=n;i++){
//            if(i == 1 || i == n){
//                for(int j = 1;j<=n;j++) {
//                    System.out.print("*");
//                }
//            }
//
//            else{
//                System.out.print("*");
//                for(int j = 0; j<spaces;j++){
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//            }

            for(int j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

    }
}
