package leetcode;

public class CountUnguardedCells {
    int[][] grid;
    int m;
    int n;
    // 2 = wall
    // -1 = visited and filled
    // 0 = unguarded
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        this.m = m;
        this.n = n;
        grid = new int[m][n];

        for (int[] wall : walls) {
            grid[wall[0]][wall[1]] = 2; // wall
        }
        for (int[] guard : guards) {
            grid[guard[0]][guard[1]] = 3; // guard
        }
        for (int[] guard : guards) {
            helper(guard[0], guard[1]);
        }
        int unguarded = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    unguarded++;
                }
            }
        }

        return unguarded;
    }

    private void helper(int i,int j){
        for(int k=j+1;k<n;k++){
            if(grid[i][k]==2 || grid[i][k] == 3){
                break;
            }
            grid[i][k] = -1;
        }

        for(int k=i+1;k<m;k++){
            if(grid[k][j]==2 || grid[k][j]==3){
                break;
            }
            grid[k][j] = -1;
        }

        for(int k=i-1;k>=0;k--){
            if(grid[k][j]==2 || grid[k][j]==3){
                break;
            }
            grid[k][j] = -1;
        }

        for(int k=j-1;k>=0;k--){
            if(grid[i][k]==2 || grid[i][k]==3){
                break;
            }
            grid[i][k] = -1;
        }
    }
}
