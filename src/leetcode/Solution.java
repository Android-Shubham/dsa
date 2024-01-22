package leetcode;

import java.util.*;

class Solution {
    public static void main(String[] args) {
        System.out.println(findWinners(new int[][]{{1,3},{2,3},{3,6},{5,6},{5,7},
                {4,5},{4,8},{4,9},{10,4},{10,9}}));
    }
    public static List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> lost = new HashMap<>();
        for(int i=0;i<matches.length;i++){
            int[] cur = matches[i];
            if(!lost.containsKey(cur[0])){
                lost.put(cur[0],0);
            }

            if(lost.containsKey(cur[1])){
                lost.put(cur[1],lost.get(cur[1])+1);
            }else{
                lost.put(cur[1],1);
            }
        }

        List<Integer> noLost = new ArrayList<>();
        List<Integer> oneLose = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry : lost.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if(value==0){
                noLost.add(key);
            }
            if(value==1){
                oneLose.add(key);
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        Collections.sort(noLost);
        Collections.sort(oneLose);
        result.add(noLost);
        result.add(oneLose);
        return result;

    }
}