package dfs;

public class CountSubIslands1905 {
    int m;
    int n;

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int islands = 0;
        m = grid2.length;
        n = grid2[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid2[i][j]==1 && dfs(grid1,grid2,i,j)){
                    islands++;
                }
            }
        }
        return islands;
    }

    private boolean dfs(int[][] grid1, int[][] grid2,int i,int j){
        if(i<0 || i>=m || j<0 || j>=n || grid2[i][j]==0){
            return true;
        }
        if(grid2[i][j]!=grid1[i][j]){
            return false;
        }
        grid2[i][j] = 0;
        boolean res = true;

        res &= dfs(grid1,grid2,i+1,j);
        res &= dfs(grid1,grid2,i-1,j);
        res &= dfs(grid1,grid2,i,j+1);
        res &= dfs(grid1,grid2,i,j-1);
        return res;
    }
}
