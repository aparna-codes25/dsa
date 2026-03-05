class LongestSubarrayWithAtmostTwoDistinctIntegers {
    public int totalElements(int[] arr) {
        // code here
        /*
        
        Sliding window approach
        
        1. Keep 2 pointers i and j at the start of element. Initialise 
        maxSize as 0.
        2. Maintain a hashmap to have frequency of elements in the window
        arr[i ... j]
        3. keep adding element arr[j] into the hashmap
        4. Since the subarray can have atmost 2 elements, we need to keep
        updating the maxSize for every element added into hashmap because for 
        an empty array or array containing only 1 distinct element maxSize will 
        be 1 (which is atmost 2)
        5. Whenever the number of distinct entries in hashmap (h.size()) is greater than1
        we move the left pointer and shrink the window
        6. Now the shrunken window needs to have updated entries in this hashmap. 
        So we remove entries of arr[i] in the hashmap by 1 as it belonged to the previous
        window. If on decrementing by 1, the frequency of arr[i] becomes <= 0, we remove 
        it from the hashmap to keep updated frequency count.
        7. Update maxSize as max(maxSize,j-i+1) where j-i+1 is the current window size
        8. Repeat steps 2-7 until i<n and j<n where n is < arr.length
        9. Return maxSize
        
        */
        int n = arr.length;
        int i = 0;
        int j = 0;
        
        int maxSize = 0;
        
        HashMap<Integer,Integer> h = new HashMap<>();
        
        while (i <n && j<n){
            h.put(arr[j],h.getOrDefault(arr[j],0)+1);
            
            if(h.size() > 2){
                h.put(arr[i],h.get(arr[i])-1);
                if(h.get(arr[i]) <= 0){
                    h.remove(arr[i]);
                }
                i++;
            }
            
            maxSize = Math.max(maxSize, j - i + 1);
            j++;
        }
        
        return maxSize;
    }
}