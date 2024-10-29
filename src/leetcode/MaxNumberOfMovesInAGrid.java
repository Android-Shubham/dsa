package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class MaxNumberOfMovesInAGrid {
    public static void main(String[] args) {
        MaxNumberOfMovesInAGrid maxNumberOfMovesInAGrid = new MaxNumberOfMovesInAGrid();
        System.out.println(maxNumberOfMovesInAGrid.maxMoves(new int[][]{{2,4,3,5},{5,4,9,8},{3,4,2,11},{10,9,13,15}}));
    }
    public int maxMoves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int moves = 0;
        boolean[][] visited = new boolean[n][m];
        int[] dirs = {-1,0,1};
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            visited[i][0] = true;
            q.offer(new int[]{i,0,0}); //row col count
        }
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int[] cur = q.poll();
                int curRow = cur[0];
                int curCol = cur[1];
                int curCount = cur[2];
                moves = Math.max(moves,curCount);
                for(int dir : dirs){
                    int row = curRow + dir;
                    int col = curCol + 1;
                    int count = curCount + 1;
                    if(row>=0 && row<n && col>=0 && col<m && !visited[row][col] && grid[curRow][curCol]<grid[row][col]){
                        visited[row][col] = true;
                        q.offer(new int[]{row,col,count});
                    }
                }
            }
        }
        return moves;
    }
}
