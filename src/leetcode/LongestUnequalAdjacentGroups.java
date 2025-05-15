package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LongestUnequalAdjacentGroups {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int n = words.length;
        List<String> ans = new ArrayList<>();
        int prev = -1;
        for(int i=0;i<n;i++){
            if(prev != groups[i]){
                ans.add(words[i]);
            }
            prev = groups[i];
        }
        return ans;
    }
}
