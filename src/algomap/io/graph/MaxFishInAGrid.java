package algomap.io.graph;

public class MaxFishInAGrid {
    int max = 0;
    int n;
    int m;

    public int findMaxFish(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] > 0) {
                    int count = dfs(grid, i, j, 0);
                    max = Math.max(max, count);
                }
            }
        }
        return max;
    }

    private int dfs(int[][] grid, int i, int j, int count) {
        if (i < 0 || j < 0 || i >= n || j >= m || grid[i][j] == 0) {
            return 0;
        }
        int cur = grid[i][j];
        grid[i][j] = 0;
        int down = dfs(grid, i + 1, j, count);
        int up = dfs(grid, i - 1, j, count);
        int right = dfs(grid, i, j + 1, count);
        int left = dfs(grid, i, j - 1, count);
        return cur + left + right + up + down;
    }
}
