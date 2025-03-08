package leetcode;

public class MinSwapsToGroupAllOnesTogether {
    public int minSwaps(int[] nums) {
        int total = 0;
        int n = nums.length;
        for (int num : nums) {
            total += num;
        }
        if (total == 0) {
            return 0;
        }
        int i = 0;
        int zeroes = 0;
        for (int k = 0; k < total; k++) {
            if (nums[k] == 0) {
                zeroes++;
            }
        }
        int swaps = zeroes;
        int j = total - 1;
        while (i < n) {
            if (i != 0) {
                if (nums[i - 1] == 0) {
                    zeroes--;
                }
                if (nums[j%n]==0) {
                    zeroes++;
                }
            }
            swaps = Math.min(swaps,zeroes);
            i++;
            j++;
        }
        return swaps;
    }
}
