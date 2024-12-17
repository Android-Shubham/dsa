package leetcode;

public class RepeatedString {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        int curIndex = 25;
        StringBuilder ans = new StringBuilder();
        while (curIndex >= 0) {
            if (freq[curIndex] < 1) {
                curIndex--;
                continue;
            }
            int use = Math.min(repeatLimit, freq[curIndex]);
            ans.append(String.valueOf((char) ('a' + curIndex)).repeat(Math.max(0, use)));
            freq[curIndex] -= use;
            if (freq[curIndex] > 0) {
                int nextIndex = curIndex - 1;
                while (nextIndex >= 0 && freq[nextIndex] == 0) {
                    nextIndex--;
                }
                if (nextIndex < 0) {
                    break;
                }
                ans.append((char) ('a' + nextIndex));
                freq[nextIndex]--;
            }
        }
        return ans.toString();
    }
}
