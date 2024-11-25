package algomap.io.ArryasAndStrings;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


//https://leetcode.com/problems/sliding-puzzle/?envType=daily-question&envId=2024-11-25
public class SlidingPuzzle {

    public int slidingPuzzle(int[][] board) {
        String target  = "123450";
        int[][] directions = {{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{2,4}};
        StringBuilder initial = new StringBuilder();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                initial.append(board[i][j]);
            }
        }

        Set<String> visited = new HashSet<>();
        Queue<String> q = new LinkedList<>();
        visited.add(initial.toString());
        q.offer(initial.toString());
        int moves = 0;
        while(!q.isEmpty()){
            int size = q.size();
            while(size-- >0){
                String cur = q.poll();
                if(cur.equals(target)) return moves;
                int zero = cur.indexOf('0');
                for(int dir : directions[zero]){
                    String newState = swap(cur,zero,dir);
                    if(visited.contains(newState)) continue;
                    visited.add(newState);
                    q.offer(newState);
                }
            }
            moves++;
        }

        return -1;
    }

    private String swap(String str,int pos, int newPos){
        char[] strs = str.toCharArray();
        char temp = strs[pos];
        strs[pos] = strs[newPos];
        strs[newPos] = temp;
        return new String(strs);
    }
}
