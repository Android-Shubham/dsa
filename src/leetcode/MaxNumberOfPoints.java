package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MaxNumberOfPoints {
    int n;
    int m;
    int cur;
    public int[] maxPoints(int[][] grid, int[] queries) {
        int[][] dirs = {{-1,0},{1,0},{0,-1},{0,1}};
        int k = queries.length;
        int[][] sorted = new int[k][2];
        for(int i=0;i<k;i++){
            sorted[i][0] = queries[i];
            sorted[i][1] = i;
        }
        Arrays.sort(sorted,(a,b)->a[0]-b[0]);
        int n = grid.length;
        int m = grid[0].length;
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b)->a[0]-b[0]);
        minHeap.offer(new int[]{grid[0][0],0,0});
        int[] res = new int[k];
        int total = 0;
        boolean[][] visited = new boolean[n][m];
        visited[0][0] = true;
        for(int i=0;i<k;i++){
            int query = sorted[i][0];
            int index = sorted[i][1];
            while(!minHeap.isEmpty() && minHeap.peek()[0]<query){
                total++;
                int[] cur = minHeap.poll();
                int val = cur[0];
                int row = cur[1];
                int col = cur[2];
                for(int[] dir : dirs){
                    int newRow = dir[0]+row;
                    int newCol = dir[1]+col;
                    if(newRow>=0 && newRow<n && newCol>=0 && newCol<m && !visited[newRow][newCol]){
                        minHeap.offer(new int[]{grid[newRow][newCol],newRow,newCol});
                        visited[newRow][newCol] = true;
                    }
                }
            }
            res[index] = total;
        }
        return res;
    }

    public static void main(String[] args) {
        MaxNumberOfPoints max = new MaxNumberOfPoints();
        System.out.println(Arrays.toString(max.maxPoints(new int[][]{{1, 2, 3}, {2, 5, 7}, {3, 5, 1}}, new int[]{5, 6, 2})));
    }
}
