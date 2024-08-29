package dfs;

public class NumberOfIslands200 {
    public static void main(String[] args) {
        System.out.println(numIslands(new char[][]{{'0','1'}}));
    }
    static int m;
    static int n;
    public static int numIslands(char[][] grid) {
        int islands = 0;
        m = grid.length;
        n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    islands++;
                }
            }
        }
        return islands;
    }


    private static void dfs(char[][] grid,int i,int j){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]=='0'){
            return;
        }
        grid[i][j] = '0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}
