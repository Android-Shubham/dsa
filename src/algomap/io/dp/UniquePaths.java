package algomap.io.dp;

public class UniquePaths {
    int count = 0;
    public int uniquePaths_bruteforce_tle(int m, int n) {
        backtrack(0,0,m,n);
        return count;
    }
    private void backtrack(int start,int end,int m,int n){
        if(start>=m || end>=n) return;
        if(start == m-1 && end==n-1){
            count++;
            return;
        }
        backtrack(start+1,end,m,n);
        backtrack(start,end+1,m,n);
    }

    public int uniquePaths(int m, int n) {
        int[][] grid = new int[m][n];
        for(int i=0;i<m;i++) grid[i][0]=1;
        for(int i=0;i<n;i++) grid[0][i]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1) continue;
                grid[i][j] = grid[i-1][j]+grid[i][j-1];
            }
        }
        return grid[m-1][n-1];
    }
}
