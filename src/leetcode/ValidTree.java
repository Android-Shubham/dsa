package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidTree {
    Set<Integer> visited = new HashSet<>();
    public boolean validTree(int n, int[][] edges) {
        if(edges.length>n-1) return false;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        if(!dfs(0,-1,adj)){
            return false;
        }
        return visited.size() == n;
    }

    private boolean dfs(int node,int parent,List<List<Integer>> adj){
        if(visited.contains(node)) return false;
        visited.add(node);
        for(int nei : adj.get(node)){
            if(nei != parent){
                if(!dfs(nei,node,adj)){
                    return false;
                }
            }
        }
        return true;
    }
}
