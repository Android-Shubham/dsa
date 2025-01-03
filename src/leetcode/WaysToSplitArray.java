package leetcode;

public class WaysToSplitArray {
    public int waysToSplitArray(int[] nums) {
        int n = nums.length;
        long[] left = new long[n];
        long[] right = new long[n];
        left[0] = nums[0];
        right[n-1] = nums[n-1];
        for(int i=1;i<n;i++){
            left[i] = nums[i] + left[i-1];
            right[n-i-1] = nums[n-i-1] + right[n-i];
        }
        int count = 0;
        for(int i=1;i<n;i++){
            if(left[i-1]>=right[i]){
                count++;
            }
        }
        return count;
    }
}
