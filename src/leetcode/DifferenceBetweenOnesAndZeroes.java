package leetcode;

public class DifferenceBetweenOnesAndZeroes {
    public int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] rows = new int[n];
        int[] cols = new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                rows[i]+=grid[i][j];
                cols[j]+=grid[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j] = rows[i] + cols[j] - (m-rows[i]) - (n-cols[j]);
            }
        }
        return grid;
    }
}
