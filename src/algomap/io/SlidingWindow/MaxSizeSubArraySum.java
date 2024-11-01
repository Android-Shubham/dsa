package algomap.io.SlidingWindow;

public class MaxSizeSubArraySum {

    public static void main(String[] args) {
        MaxSizeSubArraySum maxSizeSubArraySum = new MaxSizeSubArraySum();
        System.out.println(maxSizeSubArraySum.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));

    }

    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int n = nums.length;
        int curSum = 0;
        int window = Integer.MAX_VALUE;
        while (right < n) {
            curSum += nums[right];
            while (curSum >= target) {
                window = Math.min(window, right - left + 1);
                curSum -= nums[left];
                left++;
            }
            right++;
        }
        return window == Integer.MAX_VALUE ? 0 : window;
    }
}
