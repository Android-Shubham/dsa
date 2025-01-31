package algomap.io.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MakingALargeIsland {
    int n;
    int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int largestIsland(int[][] grid) {
        n = grid.length;
        HashMap<Integer, Integer> areaMap = new HashMap<>();
        int index = 2;
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int area = dfs(grid, i, j, index);
                    areaMap.put(index++, area);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }
        if (maxArea == n * n) {
            return maxArea;
        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                int newArea = 1;
                Set<Integer> uniqueIslands = new HashSet<>();
                if (grid[i][j] == 0) {

                    for (int k = 0; k < 4; k++) {
                        int new_i = i + dirs[k][0];
                        int new_j = j + dirs[k][1];
                        if (new_i >= 0 && new_j >= 0 && new_i < n && new_j < n && grid[new_i][new_j] > 1) {
                            uniqueIslands.add(grid[new_i][new_j]);
                        }
                    }
                }
                for (int idx : uniqueIslands) {
                    newArea += areaMap.get(idx);
                }
                maxArea = Math.max(maxArea, newArea);
            }

        }
        return maxArea;
    }

    private int dfs(int[][] grid, int i, int j, int index) {
        if (i < 0 || j < 0 || i >= n || j >= n || grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = index;
        return 1 + dfs(grid, i + 1, j, index) + dfs(grid, i - 1, j, index) + dfs(grid, i, j + 1, index) + dfs(grid, i, j - 1, index);
    }
}
