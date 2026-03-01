package learn.pattern7;

public class Solution7 {

    public void pattern7(int n){
        int star = 1;
         // increment by +2
        int space = 0;
        for(int i = 1;i<=n;i++){
            space = n - i;
            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=star;j++){
                System.out.print("*");
            }
            star += 2;
            System.out.println();
        }
    }
}
