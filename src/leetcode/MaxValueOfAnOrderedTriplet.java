package leetcode;

public class MaxValueOfAnOrderedTriplet {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        long res = 0;
        for(int k=2;k<n;k++){
            int max = nums[0];
            for(int j=1;j<k;j++){
                res = Math.max(res,(long)(max-nums[j])*nums[k]);
                max = Math.max(max,nums[j]);
            }
        }
        return res;
    }
}
