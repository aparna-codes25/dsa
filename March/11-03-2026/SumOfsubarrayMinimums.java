import java.util.Stack;

public class SumOfsubarrayMinimums {
    public int sumSubMins(int[] arr) {
        // TC: O(n)
        // SC: O(n)
        
        // core idea: 
        // We are finding the number of arrays on the right(R) side of the current element where 
        // current element is the minimum
        // (This is similar to 10 March POTD: Finding the number of subaarys with first minimum element)
        // Similar manner we do it for finding the number of arrays on the left(L) where the current element 
        // is minimum.
        
        // We find the total possible subarrays where current element is the min as L * R
        // Sum = arr[i] * L * R (as arr[i] is the min in the subarrays 
        // that can be formed combining left and right subarrays)
        
        int n = arr.length;
        
        Stack<Integer> st = new Stack<>();
        
        int sum = 0;
        
        int[] left = new int[n];
        int[] right = new int[n];
        
        for(int i = n-1; i>= 0;i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            
            int last = (st.isEmpty() == true) ? n : st.peek();
            
            right[i] = (last - i);
            st.push(i);
        }
        
        st.clear();
        
        for(int i = 0; i<n;i++){
            while(!st.isEmpty() && arr[st.peek()] > arr[i]) {
                // arr[i] was included in the right subarray
                st.pop();
            }
            
            int last = (st.isEmpty() == true) ? -1 : st.peek();
            
            left[i] = (i - last);
            
            st.push(i);
        }
        
        for(int i = 0;i<n;i++){
            sum += (arr[i] * left[i] * right[i]);
        }
        
        return sum;
    }
}
