public class SmallestWindowContainingAllCharacters {
    public static String minWindow(String s, String p) {
        // code here
        int n = s.length();
        int m = p.length();
        
        int start = -1;
        int end = -1;
        int minLen = Integer.MAX_VALUE;
        
        // Edge case 1: When length of p is 0, return an empty string
        if(p.length() == 0) return "";
        
        HashMap<Character,Integer> countP = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        
        // Finding the frequency map of string p
        // we need to find a substring such that 
        // 1. it has the all the characters in p (distinct charcaters)
        // 2. and also the same frequency of characters 
        for(int i = 0;i <m; i++){
            countP.put(
                p.charAt(i),countP.getOrDefault(p.charAt(i),0)+1);
        }
        
        int j = 0;
        int i = 0;
        
        int have = 0;
        
        // For satisfying condition 1 mentioned above
        int need = countP.size();
        
        while(j<n){
            window.put(s.charAt(j),
            window.getOrDefault(s.charAt(j),0)+1);
            
            // For satisfying condition 2 mentioned above
            if(countP.containsKey(
                s.charAt(j)) && 
                window.get(s.charAt(j)) == countP.get(s.charAt(j))){
                have++;
            }
            
            while(have == need){
                
                // update the result
                
                if(j - i + 1 < minLen){
                    start = i;
                    end = j;
                    minLen = j - i + 1;
                }
                
                // move the left pointer to a smaller substring 
                // within the current string that has have == need
                
                window.put(s.charAt(i),window.get(s.charAt(i))-1);
                
                // If condition 1 is true but condition 2 fails then
                // we are don't consider that character
                // So we dcrement have by 1 and also shrink the window
                // by moving the left pointer
                if(countP.containsKey(
                    s.charAt(i))&&
                    window.get(s.charAt(i)) < countP.get(s.charAt(i))
                    ){
                    have--;
                }
                i++;
            }
            j++;
        }
        
        // Edge case 2: When string p cannot be found within s, return ""
        return (minLen != Integer.MAX_VALUE) ?
        s.substring(start,end+1): "";
    }
}