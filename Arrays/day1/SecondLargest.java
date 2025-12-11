package Arrays.day1;

public class SecondLargest {

    public int secondLargest(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }

            else if (arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }
        return (max2 == Integer.MIN_VALUE) ? -1 : max2;
    }

}