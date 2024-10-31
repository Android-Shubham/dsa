package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeating longestSubstringWithoutRepeating = new LongestSubstringWithoutRepeating();
        System.out.println(longestSubstringWithoutRepeating.lengthOfLongestSubstring("pwwkew"));
    }

    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int window = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (!set.contains(cur)) {
                window = Math.max(window, i - left + 1);
            } else {
                while (left < i && set.contains(cur)) {
                    set.remove(s.charAt(left));
                    left++;
                }
            }
            set.add(cur);
        }
        return window;
    }
}
