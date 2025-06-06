package leetcode;

public class MaxProductSubArray {
    public static void main(String[] args) {
        MaxProductSubArray maxProductSubArray = new MaxProductSubArray();
        System.out.println(maxProductSubArray.maxProduct(new int[]{-2, 3, -4}));
    }
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int res = nums[0];
        int prefix = 0, suffix = 0;

        for (int i = 0; i < n; i++) {
            prefix = nums[i] * (prefix == 0 ? 1 : prefix);
            suffix = nums[n - 1 - i] * (suffix == 0 ? 1 : suffix);
            res = Math.max(res, Math.max(prefix, suffix));
        }
        return res;
    }
}
