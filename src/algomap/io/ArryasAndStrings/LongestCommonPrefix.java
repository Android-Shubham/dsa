package algomap.io.ArryasAndStrings;

import java.util.Arrays;

//https://leetcode.com/problems/longest-common-prefix/description/
public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(new String[]{"abc", "flower", "fl", "flow", "flight", "zing"}));
    }

    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;
        while (c < first.length()) {
            if (first.charAt(c) == last.charAt(c)) {
                c++;
            } else {
                break;
            }
        }
        return c == 0 ? "" : first.substring(0, c);
    }
}
