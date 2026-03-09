
public class LargestNumberInOneSwap {
    public String largestSwap(String s) {}
        
        // Idea is smallest leftmost digit has a larger place value
        // than the rightmost largest digit.
        // We find the rightmost largest digit and leftmost smallest digit (which has highest possible 
        // place value) and swap both
        int n = s.length();
        char[] arr = s.toCharArray();
        
        int maxInd = -1;
        int maxDigit = -1;
        
        int l = -1;
        int r = -1;
        
        char temp;
        
        for(int i = n-1;i>=0;i--){
            int digit = arr[i] - '0';
            if(digit > maxDigit){
                maxDigit = digit;
                maxInd = i;
            }   
            
            // Finding a small digit from right to left that can be
            // swapped with the max Digit
            // l -> index of smallest digit in left
            // r -> index of largest digit in the right
            
            
            else if(digit < maxDigit){
                l = i;
                r = maxInd;
            }
        }
        
        // No swapping is required
        // maxDigit and smallest digit with largest place value is same
        if(l == -1) return s;
        
        temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        
        return new String(arr);
    }
}
