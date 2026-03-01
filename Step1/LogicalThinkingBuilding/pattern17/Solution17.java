package learn.pattern17;

public class Solution17 {

    public void pattern17(int n){
        int spaces = 0;
        int len = 1;
        char start = 'A';
        for(int i = 1;i<=n;i++){

            // Printing the spaces

            spaces = n-i;
            for(int j = 1;j<=spaces;j++){
                System.out.print(" ");
            }

            // Printing the string

            char[] str = new char[len];
            int k = 0;
            while(k<=len/2){
                str[k] = (char) (start+k);
                str[len-k-1] = str[k];
                k++;
            }
            len+=2;
            String toPrint = new String(str);
            System.out.print(toPrint);
            System.out.println();

        }
    }
}
