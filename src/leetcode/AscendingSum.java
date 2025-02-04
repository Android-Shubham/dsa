package leetcode;

public class AscendingSum {
    public int maxAscendingSum(int[] nums) {
        int max = 0;
        int n = nums.length;
        int i = 1;
        while (i < n) {
            int count = nums[i - 1];
            while (i < n && nums[i] > nums[i - 1]) {
                count += nums[i];
                i++;
            }
            max = Math.max(count, max);
            i++;
        }
        return max == 0 ? nums[0] : max;
    }
}
