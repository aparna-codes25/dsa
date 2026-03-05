import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = sc.nextInt();
        LongestSubstringWithKUniques sol = new LongestSubstringWithKUniques();
        int result = sol.longestKSubstr(s, k);  
        System.out.println(result);
    }
}
