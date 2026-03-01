package learn.pattern13;

public class Solution13 {

    public void pattern13(int n){
        int start = 1;

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }
    }
}
