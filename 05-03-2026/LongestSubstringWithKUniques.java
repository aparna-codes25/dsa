public class LongestSubstringWithKUniques {
    public int longestKSubstr(String s, int k) {
        // code here
        /*
        
        Sliding Window Approach:
        TC: O(n)
        SC: O(n)
        
        1. Initialise n as length of string and hashmap to store frequency of 
        distinct characters in the current window.
        2. Initialise left and right pointers as i and j resp to 0. 
        3. Keep adding the charcater pointed by right pointer into hashmap. 
        4. If the size of hashmap is k, update maxSize as max(maxSize,j-i+1)
        5. If the size of hashmap exceeds k, move the left pointer in such a way
        that we find a smaller substring within the current string having exactly 
        k unique characters. As and when we move left pointer, remove the occurence of
        the character pointed by i in hashmap.
        6. If maxSize is 0, return -1 else return maxSize
        
        */
        
        int n = s.length();
        HashMap<Character,Integer> h = new HashMap<>();
        
        int i = 0;
        int j = 0;
        
        int maxSize = 0;
        
        while(j<n){
            char c = s.charAt(j);
            h.put(c,h.getOrDefault(c,0)+1);
            
            if(h.size() > k){
                while(h.size() > k){
                    h.put(s.charAt(i),h.get(s.charAt(i)) - 1);
                    
                    if(h.get(s.charAt(i)) <= 0){
                        h.remove(s.charAt(i));
                    }
                    
                    i++;
                }
            }
            
            if(h.size() == k){
                maxSize = Math.max(maxSize,j-i+1);
            }
            
            j++;
        }
        
        return (maxSize == 0) ? -1 : maxSize;
    }
}
