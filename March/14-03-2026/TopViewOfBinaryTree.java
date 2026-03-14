import java.util.*;

class Pair{
    Node node;
    int pos;
    
    Pair(Node node, int pos){
        this.node = node;
        this.pos = pos;
    }
}
public class TopViewOfBinaryTree{
    public ArrayList<Integer> topView(Node root) {
        // code here
        
        // Intuition: Do BFS traversal on the tree.
        // The tree nodes are modified into object as 
        // Pair(Node,pos)
        // pos is the Horizontal distance from the root.
        // initialise a Tree map with entries of form
        // pos: first node found in this distance.
        // left node - pos-1
        // right node - pos +1
        // We add the first node seen in that pos.
        // To always add only the first node seen in that pos,
        // we check if there is a key in the map with key value as pos
        
        Map<Integer,Node> map = new TreeMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(root,0));
        map.put(q.peek().pos,q.peek().node);
        
        while(!q.isEmpty()){
            
            int pos = q.peek().pos;
            if(!map.containsKey(pos)){
                map.put(q.peek().pos,q.peek().node);
            }
            
            if(q.peek().node.left!=null){
                q.add(new Pair(q.peek().node.left,q.peek().pos-1));
            }
            
            if(q.peek().node.right!=null){
                q.add(new Pair(q.peek().node.right,q.peek().pos+1));
            }
            
            q.remove();
        }
        
        for(int pos: map.keySet()){
            ans.add(map.get(pos).data);
        }
        
        return ans;
        
    }
}
