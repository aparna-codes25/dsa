import java.util.Stack;

public class SubarraysWithFirstElementMinimum {
    public int countSubarrays(int[] arr) {
        // TC: O(n)
        // SC: O(n)
        
        // Core idea: for an element to be the first minimum 
        // element in the subarray, the subsequent elements of 
        // subarray must be greater than the first element
        
        // We initialise a stack that stores the index of every element
        
        // we consider every element as the potential first min 
        // element and add it's index into the stack.
        // Then we keep finding elements greater than current 
        // element by popping the top of stack if top index element
        // >= current element.
        // The final index (found on top of stack) is the last index of 
        // the subarray containing the current element as first element
        // (last index - current index) = all possible subarrays with first 
        // min element as current element
        // So, add the length of the subarray to the count
        
        int n = arr.length;
        int c = 0;
        
        Stack<Integer> st = new Stack<>();
        
        for(int i = n-1; i>= 0; i--){
            
            while(!st.isEmpty() && arr[i] <= arr[st.peek()]){
                st.pop();
            }
            
            // if the stack is empty means all right elements of the current
            // element are greater than current element. This includes the last element
            // n-1 as well. So the last index (st.peek()) is the index from where 
            // top element >= current element condition fails. In order
            // to accomadate the last element that satisfies the latter condition
            // in subarray calculation we take the last index as the index of the first element
            // that fails the condition top element >= current element
            
            int last = (st.isEmpty() == true)? n : st.peek();
            
            c+= (last - i);
            st.push(i);
        }
        
        return c;
        
    }
}
