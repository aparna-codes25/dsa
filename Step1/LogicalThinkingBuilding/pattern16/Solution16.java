package learn.pattern16;

public class Solution16 {

    public void pattern16(int n){
        int c = 64;
        for(int i = 1;i<=n;i++){
            c++;
            for(int j = 0;j<i;j++){
                System.out.print((char) (c));
            }
            System.out.println();
        }
    }
}
