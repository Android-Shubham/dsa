package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MinOperationsToEmpty {
    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{2,3,3,2,2,4,2,3,4}));
    }

    public static int minOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        int count = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int val = entry.getValue();
            if(val==1){
                return -1;
            }else if(val%3==0){
                count+= val/3;
            }else if(val % 3==1 || val %3 ==2){
                count += (val/3)+1;
            }else{
                return -1;
            }
        }

        return count;
    }
}
