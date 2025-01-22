package algomap.io.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ZeroOneMatrix {
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] dist = new int[n][m];
        int[][] dirs = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        for (int[] d : dist) {
            Arrays.fill(d, -1);
        }
        Queue<int[]> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 0) {
                    q.offer(new int[]{i, j, 0});
                    dist[i][j] = 0;
                }
            }
        }
        while (!q.isEmpty()) {
            int size = q.size();
            for (int k = 0; k < size; k++) {
                int[] cur = q.poll();
                int i = cur[0];
                int j = cur[1];
                int dis = cur[2];
                for (int[] d : dirs) {
                    int new_i = i + d[0];
                    int new_j = j + d[1];
                    if (new_i < 0 || new_j < 0 || new_i >= n || new_j >= m || dist[new_i][new_j] != -1) {
                        continue;
                    }

                    dist[new_i][new_j] = dis + 1;
                    q.offer(new int[]{new_i, new_j, dis + 1});
                }
            }
        }

        return dist;
    }
}
