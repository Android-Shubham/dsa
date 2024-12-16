package algomap.io.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWaterFlow {
    int n;
    int m;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        n = heights.length;
        m = heights[0].length;
        boolean[][] pacific = new boolean[n][m];
        boolean[][] atlantis = new boolean[n][m];

        for (int row = 0; row < n; row++) {
            dfs(heights, row, 0, Integer.MIN_VALUE, pacific);
            dfs(heights, row, m - 1, Integer.MIN_VALUE, atlantis);
        }
        for (int col = 0; col < m; col++) {
            dfs(heights, 0, col, Integer.MIN_VALUE, pacific);
            dfs(heights, n - 1, col, Integer.MIN_VALUE, atlantis);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (pacific[i][j] && atlantis[i][j]) {
                    res.add(Arrays.asList(i, j));
                }
            }
        }
        return res;
    }

    private void dfs(int[][] heights, int i, int j, int prev, boolean[][] ocean) {
        if (i < 0 || j < 0 || i >= n || j >= m || heights[i][j] < prev || ocean[i][j]) return;

        ocean[i][j] = true;
        dfs(heights, i + 1, j, heights[i][j], ocean);
        dfs(heights, i - 1, j, heights[i][j], ocean);
        dfs(heights, i, j + 1, heights[i][j], ocean);
        dfs(heights, i, j - 1, heights[i][j], ocean);
    }
}
