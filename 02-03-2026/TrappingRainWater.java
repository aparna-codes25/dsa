public class TrappingRainWater {
    public int maxWater(int arr[]) {
        // code here
        int n = arr.length;
        int tot = 0;
       
       // Prefix, Suffix Max approach -
       // TC : O(n)
       // SC: O(n)
        // int[] prefixMax = new int[n];
        // int[] suffixMax = new int[n];
        
        // prefixMax[0] = arr[0];
        // suffixMax[n-1] = arr[n-1];
        
        // for(int i = 1;i<n;i++){
        //     prefixMax[i] = Math.max(prefixMax[i-1],arr[i]);  
        // }
        
        // for(int i = n-2; i>=0; i--){
        //     suffixMax[i] = Math.max(suffixMax[i+1],arr[i]);
        // }
        
        // for(int i = 0; i<n;i++){
        //     tot += (Math.min(prefixMax[i],suffixMax[i]) - arr[i]);
        // }
        
        
        // ----------------------------------------------------------
        
        // Two - pointer Approach
        // TC: O(n)
        // SC - O(1)
        
        // int lMax = arr[0];
        // int rMax = arr[n-1];
        
        // int left = 0;
        // int right = n-1;
        
        // while(left <= right){
        //     if(lMax <= rMax){
                
        //         tot += (Math.max(0,lMax - arr[left]));
        //         lMax = Math.max(lMax, arr[left]);
        //         left++;
        //     }
            
        //     else {
                
        //         tot += (Math.max(0, rMax - arr[right]));
        //         rMax = Math.max(rMax, arr[right]);
        //         right--;
        //     }
        // }
        
        // ----------------------------------------------------------
        
        return tot;
        
    }
    
}
