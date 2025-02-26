package leetcode;

public class MaxSubArraySum {
    //kadane's algorithm
    public int maxAbsoluteSum(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];
        int n = nums.length;
        for(int i=1;i<n;i++){
            maxEndingHere = Math.max(nums[i],maxEndingHere+nums[i]);
            maxSoFar = Math.max(maxEndingHere,maxSoFar);
        }
        int minSoFar = nums[0];
        int minEndingHere = nums[0];
        for(int i=1;i<n;i++){
            minEndingHere = Math.min(nums[i],minEndingHere+nums[i]);
            minSoFar = Math.min(minEndingHere,minSoFar);
        }
        return Math.max(maxSoFar,Math.abs(minSoFar));
    }
}
