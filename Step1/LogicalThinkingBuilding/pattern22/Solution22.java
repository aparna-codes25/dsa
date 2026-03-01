package learn.pattern22;

import java.util.Arrays;

public class Solution22 {
    public void pattern22(int n){
//       int[][] mat = new int[2*n-1][2*n-1];
//
//       for(int i= 0;i<2*n-1;i++){
//           Arrays.fill(mat[i],0);
//       }

       for(int r = 0;r<2*n-1;r++){
           for(int c = 0;c<2*n-1;c++){
               int left = c;
               int right = 2 * n - 2 - c;
               int top = r;
               int bottom = 2 * n - 2 - r;

               int val = Math.min(Math.min(left,right),Math.min(top,bottom));

               System.out.print(n-val);
           }

           System.out.println();
       }
    }
}
