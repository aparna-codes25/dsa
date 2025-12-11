package Arrays.day1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {

            String line = sc.nextLine().trim();
            String[] parts = line.trim().split("\\s+");
            int[] arr = new int[parts.length];
            for (int j = 0; j < parts.length; j++) {
                arr[j] = Integer.parseInt(parts[j]);
            }

            SecondLargest sol = new SecondLargest();
            System.out.println(sol.secondLargest(arr));
        }
        sc.close();
    }

}
