package leetcode;

import java.util.Arrays;

public class FairPairs {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int n = nums.length;
        return count(nums,n,upper+1) - count(nums,n,lower);
    }
    private long count(int[] nums,int n,int bound){
        int left = 0;
        int right = n-1;
        long pairs = 0;
        while(left<right){
            int sum = nums[left] + nums[right];
            if(sum<bound){
                pairs+=(right-left);
                left++;
            }else{
                right--;
            }
        }
        return pairs;
    }
}
