package leetcode;

import java.util.HashMap;

public class MaximumSumOfDistinct {

    public long maximumSubarraySum(int[] nums, int k) {
        long res = 0;
        long total = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int begin = 0;
        int end = 0;
        while (end < nums.length) {
            int num = nums[end];
            int lastIndex = map.getOrDefault(num,-1);
            while(begin<=lastIndex || end - begin + 1 > k){
                total-=nums[begin++];
            }
            total+=num;
            map.put(num,end);
            if(end-begin+1 == k){
                res = Math.max(res,total);
            }
            end++;
        }
        return res;
    }
}
