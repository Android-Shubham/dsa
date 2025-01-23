package leetcode;

public class ServersThatCommunicate {
    public int countServers(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] marked = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    checkCol(grid,marked,i,j,n,m);
                    checkRow(grid,marked,i,j,n,m);
                    grid[i][j] = 0;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (marked[i][j]) {
                    count++;
                }
            }
        }

        return count;
    }

    private void checkRow(int[][] grid,boolean[][] marked,int i,int j,int n,int m){
        boolean found = false;
        for(int k=0;k<m;k++){
            if(k!=j && grid[i][k]==1){
                found = true;
                marked[i][k] = true;
            }
        }
        if(found){
            marked[i][j] = true;
        }
    }
    private void checkCol(int[][] grid,boolean[][] marked,int i,int j,int n,int m){
        boolean found = false;
        for(int k=0;k<n;k++){
            if(k!=i && grid[k][j]==1){
                found = true;
                marked[k][j] = true;
            }
        }
        if(found){
            marked[i][j] = true;
        }
    }
}
