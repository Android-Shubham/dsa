package leetcode;

import java.util.HashMap;

public class CountGoodSubArrays {
    public long countGood(int[] nums, int k) {
        int n = nums.length;
        int same = 0, right = -1;
        HashMap<Integer, Integer> cnt = new HashMap<>();
        long ans = 0;
        for (int num : nums) {
            while (same < k && right + 1 < n) {
                ++right;
                same += cnt.getOrDefault(nums[right], 0);
                cnt.put(nums[right], cnt.getOrDefault(nums[right], 0) + 1);
            }
            if (same >= k) {
                ans += n - right;
            }
            cnt.put(num, cnt.get(num) - 1);
            same -= cnt.get(num);
        }
        return ans;
    }

    public static void main(String[] args) {
        CountGoodSubArrays countGoodSubArrays = new CountGoodSubArrays();
        System.out.println(countGoodSubArrays.countGood(new int[]{1,1,1,1,1}, 10));
    }
}
