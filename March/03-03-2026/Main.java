import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i < n; i++){
            arr[i] = sc.nextInt();
        }
        LongestSubarrayWithAtmostTwoDistinctIntegers
         sol = new LongestSubarrayWithAtmostTwoDistinctIntegers();  
        int result = sol.totalElements(arr);
        System.out.println(result);
        sc.close();
    }
    
}
