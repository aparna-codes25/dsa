import java.util.*;

class Pair{
    
    Node node;
    int pos;
    
    Pair(Node node, int pos){
        this.node = node;
        this.pos = pos;
    }
}

public class VerticalTreeTraversal {
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        // code here
        Map<Integer,ArrayList<Integer>> h = new TreeMap<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root,0));
        
        while(!q.isEmpty()){
            
            int pos = q.peek().pos;
            Node node = q.peek().node;
            if(!h.containsKey(pos)){
                h.put(pos,new ArrayList<>());
                h.get(pos).add(node.data);
            }
            else {
                ArrayList<Integer> lis = h.get(pos);
                lis.add(node.data);
                h.put(pos,lis);
            }
            
            if(node.left!=null){
                q.add(new Pair(node.left, pos-1));
            }
            
            if(node.right!=null){
                q.add(new Pair(node.right,pos+1));
            }
            q.remove();
        }
        
        for(int pos: h.keySet()){
            ans.add(h.get(pos));
        }
        
        return ans;
    
    }
}
