package leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * <p>
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * <p>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] arr1 = {2, 7, 11, 15};
        int[] arr2 = {3, 2, 4};
        int[] arr3 = {3, 3};

        System.out.println(Arrays.toString(twoSumBruteForce(arr1, 9)));
        System.out.println(Arrays.toString(twoSumBruteForce(arr2, 6)));
        System.out.println(Arrays.toString(twoSumBruteForce(arr3, 6)));

        //optimized solution with hashmaps

        System.out.println(Arrays.toString(twoSumUsingHashmap(arr1, 9)));
        System.out.println(Arrays.toString(twoSumUsingHashmap(arr2, 6)));
        System.out.println(Arrays.toString(twoSumUsingHashmap(arr3, 6)));

    }

    private static int[] twoSumUsingHashmap(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            if (map.containsKey(nums[index])) {
                return new int[]{map.get(nums[index]), index};
            }
            map.put(target - nums[index], index);
        }
        return nums;
    }

    private static int[] twoSumBruteForce(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return res;
    }
}
