package learn.pattern8;

public class Solution8 {
    public void pattern8(int n){
        int star = 2 * n - 1;
        // decrement by 2
        int space = 0;
        for(int i = n;i>=1;i--){
            space = n - i;
            for(int j = 1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=star;j++){
                System.out.print("*");
            }
            star -= 2;
            System.out.println();
        }
    }
}
