package algomap.io.ArryasAndStrings;

import java.util.Arrays;

public class FairPair {

    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countPairs(nums,upper+1) - countPairs(nums,lower);
    }


    private long countPairs(int[] nums,int value){
        long pairs = 0;
        int left = 0;
        int right = nums.length - 1;
        while(left <right){
            int sum = nums[left] + nums[right];
            if(sum<value){
                pairs+=(right-left);
                left++;
            }else{
                right--;
            }
        }
        return pairs;
    }
}
