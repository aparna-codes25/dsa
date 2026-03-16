/*
class Solution {
    public int countAllPaths(Node root, int k) {
        // code here
        // Approach 1: Recursion on node, left and right subtrees
        // for all nodes
        // TC: O(n^2) , 
        // SC: O(h) (h - height of tree, n - number of nodes)
        
        if(root == null) return 0;
        
        int c = 0;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            Node node = q.remove();
            c += helper(node,k,0);
            
            if(node.left != null){
                q.add(node.left);
            }
            
            if(node.right!=null){
                q.add(node.right);
            }
        }
        
        return c;
    }
    
    int helper(Node root, int k, int currSum){
        int pathCount = 0;
        
        if(root == null){
            return 0;
        }
        
        currSum+=root.data;
        
        if(currSum == k){
            pathCount++;
        }
        
        pathCount += helper(root.left,k,currSum);
        pathCount += helper(root.right,k,currSum);
        
        return pathCount;
        
    }
}

 */

import java.util.HashMap;

public class KSumPath {
    public int countAllPaths(Node root, int k) {
        // code here
        
        // Approach 2: Prefix Sum
        // TC: O(n), SC: O(n)
        HashMap<Integer,Integer> h = new HashMap<>();
        int c = 0;
        
        c = helper(root,k,h,0);
        
        return c;
        
    }
    
    int helper(Node node, int k, HashMap<Integer,Integer> h, int currSum){
        if(node == null) return 0;
        
        int count = 0;
        
        currSum += node.data;
        
        if(currSum == k) count++;
        
        if(h.containsKey(currSum-k)){
            count += h.get(currSum-k);
        }
        
        h.put(currSum,h.getOrDefault(currSum,0)+1);
        
        count += helper(node.left,k,h,currSum);
        // h.put(currSum,h.get(currSum)-1);
        // if(h.get(currSum) <= 0){
        //     h.remove(currSum);
        // }
        
        count += helper(node.right,k,h,currSum);
        h.put(currSum,h.get(currSum)-1);
        if(h.get(currSum) <= 0){
            h.remove(currSum);
        }
        
        return count;
    }
    
}
