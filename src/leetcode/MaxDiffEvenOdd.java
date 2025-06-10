package leetcode;

public class MaxDiffEvenOdd {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }
        int oddMax = Integer.MIN_VALUE;
        int evenMin = Integer.MAX_VALUE;
        for (int i = 0; i < 26; i++) {
            int cur = freq[i];
            if (cur != 0) {
                if (cur % 2 == 0) {
                    evenMin = Math.min(evenMin, cur);
                } else {
                    oddMax = Math.max(oddMax, cur);
                }
            }
        }
        return oddMax - evenMin;
    }
}
