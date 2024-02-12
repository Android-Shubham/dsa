package prefixAlgorithm;

import java.util.Arrays;

public class PrefixAlgo {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(prefixSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 20})));
    }

    private static int[] prefixSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
}
