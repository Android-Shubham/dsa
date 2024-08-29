package dfs;

import java.util.ArrayList;

public class FindAllGroupsOfFarmland1991 {

    int m;
    int n;
    int r;
    int c;
    public int[][] findFarmland(int[][] land) {
        m = land.length;
        n = land[0].length;
        ArrayList<int[]> res = new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(land[i][j]==1){
                    dfs(land,i,j);
                    res.add(new int[]{i,j,r,c});
                    r = 0;
                    c = 0;
                }
            }
        }
        int[][] result = new int[res.size()][4];
        for(int i=0;i<res.size();i++){
            result[i] = res.get(i);
        }
        return result;
    }

    private void dfs(int[][] land, int i,int j){
        if(i<0 || i>=m || j<0 || j>=n || land[i][j]==0){
            return;
        }
        r = Math.max(r,i);
        c = Math.max(c,j);
        land[i][j]=0;
        dfs(land,i+1,j);
        dfs(land,i-1,j);
        dfs(land,i,j+1);
        dfs(land,i,j-1);
    }
}
