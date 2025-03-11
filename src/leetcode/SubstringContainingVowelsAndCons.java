package leetcode;

import java.util.HashSet;
import java.util.Set;

public class SubstringContainingVowelsAndCons {
    public static void main(String[] args) {
        SubstringContainingVowelsAndCons substringContainingVowelsAndCons = new SubstringContainingVowelsAndCons();
        System.out.println(substringContainingVowelsAndCons.countOfSubstrings("ieaouqqieaouqq",1));
    }
    public long countOfSubstrings(String word, int k) {
        Set<Character> set = new HashSet<>();
        int cons = 0;
        int i = 0;
        int j = 0;
        int subs = 0;
        int n = word.length();
        while (i < n && j < n) {
            char ch = word.charAt(j);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                set.add(ch);
            } else {
                cons++;
            }
            if (set.size() == 5 && cons == k) {
                j++;
                subs++;
            } else if (cons > k) {
                char old = word.charAt(i);
                set.remove(old);
                i++;
                if (old != 'a' && old != 'e' && old != 'i' && old != 'o' && old != 'u') {
                    cons--;
                }
            } else {
                j++;
            }
        }
        return subs;
    }
}
