package leetcode;

import java.util.HashSet;
import java.util.Set;

public class MaxNumbersToChooseFromRange {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set = new HashSet<>();
        for (int ban : banned) {
            if (ban <= n) {
                set.add(ban);
            }
        }
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (set.contains(i)) continue;
            if (maxSum - i < 0) return count;
            maxSum -= i;
            count++;
        }
        return count;
    }
}
