package algomap.io.graph;

import java.util.ArrayDeque;
import java.util.Deque;

public class MinObstacleToRemove {


    public int minimumObstacles(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] visited = new boolean[n][m];
        int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Deque<int[]> bfs = new ArrayDeque<>();
        bfs.add(new int[]{grid[0][0], 0, 0});
        visited[0][0] = true;
        while (!bfs.isEmpty()) {
            int[] cur = bfs.poll();
            int dist = cur[0];
            int i = cur[1];
            int j = cur[2];
            if (i == n - 1 && j == m - 1) {
                return dist;
            }
            for (int[] dir : dirs) {
                int r = i + dir[0];
                int c = j + dir[1];
                if (r < 0 || c < 0 || r >= n || c >= m || visited[r][c]) {
                    continue;
                }
                visited[r][c] = true;
                if (grid[r][c] == 0) {
                    bfs.addFirst(new int[]{dist, r, c});
                } else {
                    bfs.addLast(new int[]{dist + 1, r, c});
                }
            }
        }
        return -1;
    }
}
