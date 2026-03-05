public class MaxXorSubarrayOfsizeK {
    public int maxSubarrayXOR(int[] arr, int k) {
        // code here
        
        /*
        
        Sliding Window Approach:
        
        TC: O(n);
        SC: O(1);
        
        1. initialise n (array length), i = 0, j = k (i and j denote start and end of window)
        2. initialise currXor (this calculates current subarray Xor) as 0 and maxXor (this 
        calculates the max Xor of all subarrays visited) as 0
        3. Calculate the xor of arr[0...k-1]. Also calculate maxXor as max(maxXor,currXor)
        4. Do steps 5 - 8 unitl j < n
        5. Add arr[j] into the currXor and remove arr[i] from currXor (to remove we do currXor ^= arr[i] as 
        num ^ num = 0 in XOR logic) as arr[i] belongs to previous window.
        6. increment i to bring the current window size to k
        7. Compute maxXor as max(maxXor,currXor)
        8. Increment j to accomate the next element of the next subarray
        9. Return maxXor
        
        */
        int n = arr.length;
        int i = 0;
        int j = k;
        
        int currXor = 0;
        int maxXor = 0;
        
        for(int l = i; l<j;l++){
            currXor ^= arr[l];
        }
        
        maxXor = Math.max(maxXor,currXor);
        
        while(j < n){
            currXor ^= arr[j];
            currXor ^= arr[i];
            i++;
            maxXor = Math.max(maxXor,currXor);
            j++;
        }
        
        return maxXor;
    }
}
