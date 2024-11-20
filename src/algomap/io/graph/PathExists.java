package algomap.io.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class PathExists {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if (source == destination) {
            return true;
        }
        HashMap<Integer, ArrayList<Integer>> adj = new HashMap<>();
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            if (!adj.containsKey(from)) {
                adj.put(from, new ArrayList<>());
            }
            adj.get(from).add(to);
            if (!adj.containsKey(to)) {
                adj.put(to, new ArrayList<>());
            }
            adj.get(to).add(from);
        }
        boolean[] visited = new boolean[n];
        return dfs(source, destination, visited, adj);
    }

    private boolean dfs(int source, int destination, boolean[] visited, HashMap<Integer, ArrayList<Integer>> adj) {
        if (source == destination) return true;
        visited[source] = true;

        for (int ele : adj.get(source)) {
            if (!visited[ele] && dfs(ele, destination, visited, adj)) {
                return true;
            }
        }
        return false;
    }
}
