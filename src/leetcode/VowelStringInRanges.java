package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VowelStringInRanges {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int  n = words.length;
        int[] vowelsPrefix = new int[n];
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        for(int i=0;i<n;i++){
            char start = words[i].charAt(0);
            char end = words[i].charAt(words[i].length()-1);
            if(vowels.contains(start) && vowels.contains(end)){
                vowelsPrefix[i] = 1;
            }
            if(i!=0){
                vowelsPrefix[i] = vowelsPrefix[i] + vowelsPrefix[i-1];
            }
        }
        int m = queries.length;
        int[] ans = new int[m];
        for(int i=0;i<m;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            if(start == 0){
                ans[i] = vowelsPrefix[end];
            }else{
                ans[i] = vowelsPrefix[end] - vowelsPrefix[start-1];
            }
        }
        return ans;
    }
}
