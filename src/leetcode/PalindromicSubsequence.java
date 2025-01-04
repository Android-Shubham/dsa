package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PalindromicSubsequence {
    public int countPalindromicSubsequence(String s) {
        int[] first = new int[26];
        int[] last = new int[26];
        Arrays.fill(first, -1);
        for (int i = 0; i < s.length(); i++) {
            int cur = s.charAt(i) - 'a';
            if (first[cur] == -1) {
                first[cur] = i;
            }
            last[cur] = i;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (first[i] == -1)
                continue;
            Set<Character> set = new HashSet<>();
            for (int j = first[i] + 1; j < last[i]; j++) {
                set.add(s.charAt(j));
            }
            count += set.size();
        }
        return count;
    }
}
