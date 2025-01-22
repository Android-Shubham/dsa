package algomap.io.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MaxHeight {
    public int[][] highestPeak(int[][] isWater) {
        Queue<int[]> q = new LinkedList<>();
        int[][] dirs = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        int n = isWater.length;
        int m = isWater[0].length;
        int[][] heights = new int[n][m];
        for (int i = 0; i < n; i++) {
            Arrays.fill(heights[i], -1);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (isWater[i][j] == 1) {
                    q.offer(new int[] { i, j });
                    heights[i][j] = 0;
                }
            }
        }
        int height = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int k = 0; k < size; k++) {
                int[] cur = q.poll();
                int i = cur[0];
                int j = cur[1];
                for (int[] dir : dirs) {
                    int new_i = i + dir[0];
                    int new_j = j + dir[1];
                    if (new_i < 0 || new_i >= n || new_j < 0 || new_j >= m) {
                        continue;
                    }
                    if (heights[new_i][new_j] == -1) {
                        heights[new_i][new_j] = height;
                        q.offer(new int[]{new_i,new_j});
                    }
                }
            }
            height++;
        }

        return heights;
    }
}
