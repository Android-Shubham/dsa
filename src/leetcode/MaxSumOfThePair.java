package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MaxSumOfThePair {
    public int maximumSum(int[] nums) {
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int num : nums) {
            int sum = helper(num);
            if (!map.containsKey(sum)) {
                map.put(sum, new PriorityQueue<>((a, b) -> b - a));
            }
            map.get(sum).offer(num);
        }
        int max = -1;
        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : map.entrySet()) {
            PriorityQueue<Integer> cur = entry.getValue();
            if (cur.size() > 1) {
                int first = cur.poll();
                int second = cur.poll();
                max = Math.max(max, first + second);
            }
        }
        return max;
    }

    private int helper(int num) {
        int sum = 0;
        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }
}
