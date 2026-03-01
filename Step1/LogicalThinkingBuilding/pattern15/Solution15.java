package learn.pattern15;

public class Solution15 {
    public void pattern15(int n){
        char c = 'A';
        for(int i = n;i>=1;i--){
            for(int j = 0;j<i;j++){
                System.out.print((char)(c+j));
            }
            System.out.println();
        }
    }
}
