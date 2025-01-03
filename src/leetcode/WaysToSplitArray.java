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

    public int waysToSplitArray_optimized(int[] nums) {
        int n = nums.length;
        int count = 0;
        long total = 0;
        long left = 0;
        for (int num : nums) {
            total += num;
        }
        for(int i=0;i<n-1;i++){
            left += nums[i];
            if(left>=total-left){
                count++;
            }
        }

        return count;
    }
}
