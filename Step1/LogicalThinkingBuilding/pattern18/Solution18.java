package learn.pattern18;

public class Solution18 {
    public void pattern18(int n){
        for(int i = 0; i < n ; i++){
            int start = 64 + n - i;

            for(int j = start; j<=64 + n;j++){
                System.out.print((char) j);
            }

            System.out.println();
        }
    }
}
