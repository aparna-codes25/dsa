
public class NumberofBSTFromArray {
    int[] computeCatalan(int n){
        // Recurrence relation for catalan
        // C(n) = sum(i=0 to n-1) C(i) * C(n-i-1);
        // base cases: C(0) = 1, C(1) = 1;
        
        // Binomial coefficient formula:
        // C(n) = (2n)! / ((n+1)! (n)!)
        int[] catalan = new int[n+1];
        catalan[0] = 1;
        catalan[1] = 1;
        
        for(int i = 2;i<=n;i++){
            catalan[i] = 0;
            
            for(int j = 0 ; j<i;j++){
                catalan[i] += catalan[j] * catalan[i-j-1];
            }
        }
        
        return catalan;
    }
    public ArrayList<Integer> countBSTs(int[] arr) {
        // Code here
        
        // Intuition:
        /*
        In the sorted position of element(e) of an array is k
        All elements  <= e - left subtree
        All elements > e - right subtree
        
        No. of elements <=e = k1 = k
        No. of elements > e = k2 = n-k-1
        
        No. of valid BSTs using elements <= k = T(k1)
        No. of valid BSTs using elements > k = T(k2)
        
        Total valid subtrees using e as root = T(k1) * T(k2)
        
        No element is also a valid BST - count of valid BSTs = 1
        1 element is also a valid BST - count of valid BSTs = 1
        
        T(0) = 1, T(1) = 1
        
        This is catalan series
        */
        
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>(
            Collections.nCopies(n,0));
        int[][] sorted = new int[n][2];
        
        // Store the original indexes of the elements in 
        // column 1
        for(int i = 0; i<n;i++){
            sorted[i][0] = i;
            sorted[i][1] = arr[i];
        }
        
        // Sort the (elements,indexes) in the ascending order of elements
        Arrays.sort(sorted, (a,b) -> a[1] - b[1]);
        
        // Precompute catalan to save time complexity
        int[] catalan = computeCatalan(n);
        
        // Compute final answer based on intution
        for(int sortedInd = 0;sortedInd<n;sortedInd++){
            int originalInd = sorted[sortedInd][0];
            ans.set(originalInd,catalan[sortedInd] * catalan[n-sortedInd-1]);
        }
        
        return ans;
    }
}
