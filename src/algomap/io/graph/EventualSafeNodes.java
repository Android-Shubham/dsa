package algomap.io.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class EventualSafeNodes {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        int[] outdegree = new int[n];
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int node : graph[i]) {
                adj.get(node).add(i);
                outdegree[i]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        boolean[] safe = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (outdegree[i] == 0) {
                q.offer(i);
            }
        }
        while (!q.isEmpty()) {
            int cur = q.poll();
            safe[cur] = true;
            for (int neighbor : adj.get(cur)) {
                outdegree[neighbor]--;
                if (outdegree[neighbor] == 0) {
                    q.offer(neighbor);
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (safe[i]) {
                ans.add(i);
            }
        }
        return ans;
    }
}
