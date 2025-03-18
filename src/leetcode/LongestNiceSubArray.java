package leetcode;

public class LongestNiceSubArray {
    public int longestNiceSubarray(int[] nums) {
        int start = 0;
        int max = 0;
        int bitmask = 0;
        for(int end = 0;end<nums.length;end++){
            while((bitmask & nums[end])!=0){
                bitmask^=nums[start];
                start++;
            }
            bitmask|=nums[end];
            max = Math.max(max,end-start+1);
        }
        return max;
    }
}
