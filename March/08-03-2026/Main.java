import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] arr = line.split(" ");
        int[] nums = new int[arr.length];  
        for(int i = 0; i<nums.length;i++){
            nums[i] = Integer.parseInt(arr[i]);
        }

        PythagoreanTriplet pt = new PythagoreanTriplet();
        System.out.println(pt.pythagoreanTriplet(nums));
    }
    
}
