package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        int[] nums = {8,2,4,7};
        int limit = 4;
        int result = test.longestSubarray(nums, limit);
        System.out.println("Output: " + result);
    }
        public int longestSubarray(int[] nums, int limit) {
            int n = nums.length;
            int i = 0;
            int maxLength = 0;

            Deque<Integer> minDeque = new LinkedList<>();
            Deque<Integer> maxDeque = new LinkedList<>();

            for (int j = 0; j < n; j++) {
                // Maintain decreasing maxDeque (for max value in window)
                while (!maxDeque.isEmpty() && nums[j] > maxDeque.peekLast()) {
                    maxDeque.pollLast();
                }
                maxDeque.offerLast(nums[j]);

                // Maintain increasing minDeque (for min value in window)
                while (!minDeque.isEmpty() && nums[j] < minDeque.peekLast()) {
                    minDeque.pollLast();
                }
                minDeque.offerLast(nums[j]);

                // If difference exceeds limit, shrink the window
                while (!minDeque.isEmpty() && !maxDeque.isEmpty() &&
                        Math.abs(maxDeque.peekFirst() - minDeque.peekFirst()) > limit) {
                    if (nums[i] == minDeque.peekFirst()) {
                        minDeque.pollFirst();
                    }
                    if (nums[i] == maxDeque.peekFirst()) {
                        maxDeque.pollFirst();
                    }
                    i++;
                }

                maxLength = Math.max(maxLength, j - i + 1);
            }
            return maxLength;
        }

}
