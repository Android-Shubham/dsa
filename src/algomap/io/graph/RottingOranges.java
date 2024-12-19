package algomap.io.graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        Queue<int[]> q = new LinkedList<>();
        int minutes = 0;
        int fresh = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    q.offer(new int[] { i, j });
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        if (fresh == 0) {
            return 0;
        }
        while (!q.isEmpty()) {
            int size = q.size();
            boolean found = false;
            for (int i = 0; i < size; i++) {
                int[] cur = q.poll();
                for (int[] dir : dirs) {
                    int row = cur[0] + dir[0];
                    int col = cur[1] + dir[1];
                    if (row < 0 || col < 0 || row >= m || col >= n || grid[row][col] == 2 || grid[row][col] == 0) {
                        continue;
                    }

                    grid[row][col] = 2;
                    q.offer(new int[] { row, col });
                    found = true;
                    fresh--;
                }
            }
            if (found) {
                minutes++;
            }
        }
        if (fresh > 0) {
            return -1;
        }

        return minutes;
    }
}
