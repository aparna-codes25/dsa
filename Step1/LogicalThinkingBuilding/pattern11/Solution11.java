package learn.pattern11;

public class Solution11 {
    public void pattern11(int n){
        int start = -1;
        for(int i = 1;i<=n;i++){
            if(i%2 == 1) start = 1;
            else start = 0;

            for(int j = 1;j<=i;j++){
                System.out.print(start);
                start = (start+1)%2;
            }

            System.out.println();
        }

    }
}
