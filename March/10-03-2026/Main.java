import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] arr = line.split(" ");
        int n = arr.length;
        int[] nums = new int[n];
        
        for(int i = 0; i < n; i++){
            nums[i] = Integer.parseInt(arr[i]);
        }
        SubarraysWithFirstElementMinimum obj = new SubarraysWithFirstElementMinimum();
        System.out.println(obj.countSubarrays(nums));
    }
}
