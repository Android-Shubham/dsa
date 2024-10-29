package algomap.io.SlidingWindow;

//https://leetcode.com/problems/maximum-average-subarray-i/
public class MaxAverageSubArray {

    public double findMaxAverage_first(int[] nums, int k) {
        double sum = 0.0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        double avg = sum/k;

        for(int i=k;i<nums.length;i++){
            sum+=(nums[i]-nums[i-k]);
            avg = Math.max(avg,sum/k);
        }
        return avg;
    }

    public double findMaxAverage_optimised(int[] nums, int k) {
        int sum = 0;
        int maxSum = 0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        maxSum = sum;
        for(int i=k;i<nums.length;i++){
            sum+=(nums[i]-nums[i-k]);
            maxSum = Math.max(maxSum,sum);
        }
        return (double)maxSum/k;
    }
}
