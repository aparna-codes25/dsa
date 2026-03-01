package learn.pattern12;

public class Solution12 {
    public void pattern12(int n){
        StringBuilder str = new StringBuilder();
        int total = 2 * n;

        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                str.append(j);
            }

            int spaces = total - 2 * str.length();

            System.out.print(str);
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }
            System.out.print(str.reverse());
            System.out.println();
            str.setLength(0);
        }
    }
}
