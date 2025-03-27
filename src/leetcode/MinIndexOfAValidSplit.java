package leetcode;

import java.util.HashMap;
import java.util.List;

public class MinIndexOfAValidSplit {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        int n = nums.size();
        for(int num : nums){
            map2.put(num,map2.getOrDefault(num,0)+1);
        }
        for(int i=0;i<n;i++){
            int num = nums.get(i);
            map1.put(num,map1.getOrDefault(num,0)+1);
            map2.put(num,map2.getOrDefault(num,0)-1);
            if(map1.get(num)*2 > i+1 && map2.get(num)*2 > n-i-1){
                return i;
            }
        }

        return -1;
    }
}
