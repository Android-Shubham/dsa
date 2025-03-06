package leetcode;

import java.util.HashSet;
import java.util.Set;

public class FindMissingAndRepeated {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> set = new HashSet<>();
        int repeated = 0;
        int max = Integer.MIN_VALUE;
        for(int[] pair : grid){
            for(int num : pair){
                if(set.contains(num)){
                    repeated = num;
                }
                max = Math.max(max,num);
                set.add(num);
            }
        }
        for(int i=1;i<=max;i++){
            if(!set.contains(i)){
                return new int[]{repeated,i};
            }
        }
        return new int[]{repeated,max+1};
    }
}
