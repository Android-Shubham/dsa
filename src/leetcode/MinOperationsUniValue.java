package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class MinOperationsUniValue {
    public int minOperations(int[][] grid, int x) {
        int res = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int[] ints : grid) {
            for (int j = 0; j < grid[0].length; j++) {
                list.add(ints[j]);
            }
        }
        Collections.sort(list);
        int finalNum = list.get(list.size()/2);
        for(int num : list){
            if(num%x!=finalNum%x){
                return -1;
            }
            res+=Math.abs(finalNum-num)/x;
        }
        return res;
    }
}
