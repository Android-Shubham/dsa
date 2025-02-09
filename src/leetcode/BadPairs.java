package leetcode;

import java.util.HashMap;

public class BadPairs {
    public long countBadPairs(int[] nums) {
        long bad = 0;
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int newNum = nums[i] - i;
            int good = map.getOrDefault(newNum,0);
            bad+=i-good;
            map.put(newNum, good + 1);
        }
        return bad;
    }
}
