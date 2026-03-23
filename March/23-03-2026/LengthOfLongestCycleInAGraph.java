import java.util.*;

public class LengthOfLongestCycleInAGraph {
    public int longestCycle(int V, int[][] edges) {
        // This is used for setting visited node
        // global array which is marked visited once all
        // neighbours of the node is visited via dfs
        
        // once a node is marked visited, it can't be visited again while
        // traversing a path through another node that contains
        // the visited node.
        
        // This global array is the reason we don't revisit 
        // nodes and this causes the TC to be O(V+E) and not in 
        // exponents of V and E as all nodes 
        // have been visited only once. 
        boolean[] visited = new boolean[V];
        
        // This array is used track the current nodes in 
        // dfs path and the distance or depth of the dfs at that node
        int[] dist = new int[V];
        
        Arrays.fill(visited,false);
        Arrays.fill(dist, -1);
        
        // Final answer - longest cycle length
        int ans = -1;
        
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
        }
        
        // Start DFS from every node
        for(int i = 0; i<V;i++){
            
            // Since every node has only 1 outgoing edge, we
            // don't run any nested loop to dfs every neighbour node 
            if(!visited[i]){
                dist[i] = 0;
                ans = Math.max(ans,dfs(i,visited,dist,adj));
            }
        }
        
        return ans;
    }
    
    int dfs(int node, boolean[] visited, int[] dist, 
    List<List<Integer>> adj){
        int tempAns = -1;
        visited[node] = true;
        
        
        for(int nbr: adj.get(node)){
            
            // Cases: 
        /*
            1. The neighbour is visited and not in recur stack - 
            nothing happens. All possible paths that involves the 
            neighbour has been explored
            
            2. The neighbour is visited and in recur stack - 
            we found a cycle starting from that node. 
            
        */
        
            // If the neighbour is not already visited, we add it 
            // to current recur stack and also update it's depth
            if(!visited[nbr]){
                dist[nbr] = dist[node] + 1;
                tempAns = Math.max(tempAns,dfs(nbr,visited,dist,adj));
            }
            
            // If the node is already in the current dfs path,
            // then a cycle is found. Compute cycle length
            else if(dist[nbr] != -1){
                tempAns = Math.max(tempAns,dist[node] - dist[nbr] + 1);
            }
        }
            
        // remove from current dfs stack
        dist[node] = -1;
        return tempAns;
    }
}