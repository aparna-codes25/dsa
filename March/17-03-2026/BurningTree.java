import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BurningTree {
    public int minTime(Node root, int target) {
        // code here
        // Level Order traversal approach
        // TC: O(n), SC: O(n)
        HashMap<Node,Node> parents = new HashMap<>();
        
        // Node: Parent of node
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        // root node has no parent
        parents.put(root,null);
        Node start = null;
        
        
        // Find parent nodes of each and every node
        // Also find target node
        while(!q.isEmpty()){
            Node node = q.poll();
            if(node.data == target){
                start = node;
            }
            
            if(node.left!=null){
                q.add(node.left);
                parents.put(node.left,node);
            }
            
            if(node.right!=null){
                q.add(node.right);
                parents.put(node.right,node);
            }
            
        }
        
        q.clear();
        q.add(start);
        
        int ans = 0;
        HashMap<Node,Boolean> burnt = new HashMap<>();
        burnt.put(start,true);
        
        while(!q.isEmpty()){
            // This shows the number of nodes burnt in 1 second.
            // Or the number of nodes in a particular level
            // this variable and nested while loop ensures level order traversal
            int size = q.size();
            
            // Flag to check if new nodes where burnt or not
            boolean flag = false;
            
            while(size > 0){
                Node curr = q.poll();
                burnt.put(curr,true);
                
                if(parents.get(curr)!=null && !burnt.containsKey(parents.get(curr))){
                    flag = true;
                    q.add(parents.get(curr));
                }
                
                if(curr.left!=null && !burnt.containsKey(curr.left)){
                    flag = true;
                    q.add(curr.left);
                }
                
                if(curr.right!=null &&!burnt.containsKey(curr.right)){
                    flag = true;
                    q.add(curr.right);
                }
                
                size--;
            }
            
            // Only if atleast 1 of the nodes in the level is burnt, then count time
            if(flag) ans++;
            
        }
        
        return ans;
    }
}
