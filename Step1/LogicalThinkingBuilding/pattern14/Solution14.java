package learn.pattern14;

public class Solution14 {

    public void pattern14(int n){
        char c = 'A';
        for(int i = 1;i<=n;i++){
            for(int j = 0;j<i;j++){
                System.out.print((char)(c+j));
            }
            System.out.println();
        }
    }
}
