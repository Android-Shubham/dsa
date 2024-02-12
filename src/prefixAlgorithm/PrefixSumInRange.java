package prefixAlgorithm;

import java.util.Arrays;

public class PrefixSumInRange {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(prefixInRange(new int[]{1,2,3,4,5,6,7,8,9},0,4)));
    }

    private static int[] prefixInRange(int[] nums, int start, int end) {

        for (int i = start+1; i <= Math.min(end,nums.length-1); i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;

    }
}
