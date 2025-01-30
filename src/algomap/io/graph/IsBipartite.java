package algomap.io.graph;

import java.util.Arrays;

public class IsBipartite {
    int RED = 0;
    int BLUE = 1;
    int UNCOLORED = -1;

    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] colors = new int[n];
        Arrays.fill(colors, -1);
        for (int i = 0; i < n; i++) {
            if (colors[i] == UNCOLORED) {
                if (!isValid(graph, RED, i, colors)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(int[][] graph, int color, int node, int[] colors) {
        if (colors[node] != UNCOLORED) {
            return colors[node] == color;
        }
        colors[node] = color;
        for (int neighbor : graph[node]) {
            if (!isValid(graph, 1 - color, neighbor, colors)) {
                return false;
            }
        }
        return true;
    }
}
