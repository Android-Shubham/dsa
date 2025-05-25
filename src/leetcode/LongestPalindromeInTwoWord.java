package leetcode;

import java.util.HashMap;

public class LongestPalindromeInTwoWord {
    public static void main(String[] args) {
        LongestPalindromeInTwoWord longestPalindrome = new LongestPalindromeInTwoWord();
        System.out.println(longestPalindrome.longestPalindrome(new String[]{"em", "pe", "mp", "ee", "pp", "me", "ep", "em", "em", "me"}));
        System.out.println(longestPalindrome.longestPalindrome(new String[]{"ab", "ty", "yt", "lc", "cl", "ab"}));
    }

    public int longestPalindrome(String[] words) {
        HashMap<String, Integer> freq = new HashMap<>();
        boolean doubleCharsOdd = false;
        int len = 0;
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        for (String word : words) {
            String rev = new StringBuilder(word).reverse().toString();
            if (word.equals(rev) && freq.containsKey(word)) {
                int occr = freq.get(word);
                if (occr % 2 == 0) {
                    len += (occr * 2);
                } else {
                    if (doubleCharsOdd) {
                        len += ((occr - 1) * 2);
                    } else {
                        len += (occr * 2);
                        doubleCharsOdd = true;
                    }
                }
                freq.remove(word);
            } else if (freq.containsKey(rev)) {
                int occr1 = freq.get(word);
                int occr2 = freq.get(rev);
                len += (Math.min(occr1, occr2) * 2) * 2;
                freq.remove(word);
                freq.remove(rev);
            }
        }
        return len;
    }
}
