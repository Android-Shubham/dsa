package leetcode;

import java.util.HashMap;

public class PaintedRowOrCol {

    public int firstCompleteIndex(int[] arr, int[][] mat) {
        HashMap<Integer,int[]>map = new HashMap<>();
        int n = mat.length;
        int m = mat[0].length;
        int[] row = new int[n];
        int[] cols = new int[m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                map.put(mat[i][j],new int[]{i,j});
            }
        }
        for(int i=0;i<m*n;i++){
            int[] cur = map.get(arr[i]);
            int r=cur[0];
            int c=cur[1];
            row[r]++;
            cols[c]++;
            if(row[r]==m || cols[c]==n){
                return i;
            }
        }
        return 0;
    }
    public int firstCompleteIndex_bruteforce(int[] arr, int[][] mat) {
        HashMap<Integer,int[]> map = new HashMap<>();
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                map.put(mat[i][j],new int[]{i,j});
            }
        }
        for(int i=0;i<m*n;i++){
            int[] cur = map.get(arr[i]);
            mat[cur[0]][cur[1]] = -arr[i];
            if(checkRow(cur[0],m,mat) || checkCol(cur[1],n,mat)){
                return i;
            }
        }
        return 0;
    }

    private boolean checkRow(int i,int m,int[][] mat){
        for(int j=0;j<m;j++){
            if(mat[i][j]>0){
                return false;
            }
        }
        return true;
    }

    private boolean checkCol(int j,int n,int[][] mat){
        for(int i=0;i<n;i++){
            if(mat[i][j]>0){
                return false;
            }
        }
        return true;
    }
}
