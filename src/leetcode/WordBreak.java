package leetcode;

import java.util.HashSet;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        WordBreak wordBreak = new WordBreak();
        System.out.println(wordBreak.wordBreak("leetcode",List.of("leet","code")));
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        System.out.println("leetcode".substring(0,4));
        HashSet<String> set = new HashSet<>(wordDict);
        int n = s.length();
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        int max = 0;
        for(String word : wordDict){
            max = Math.max(max,word.length());
        }
        for(int i=0;i<=n;i++){
            for(int j=i-1;j>=Math.max(0,i-max);j--){
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}
