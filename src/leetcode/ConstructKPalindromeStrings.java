package leetcode;

public class ConstructKPalindromeStrings {
    public boolean canConstruct(String s, int k) {
        if(k>s.length()) return false;
        if(k==s.length()) return true;
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int odd = 0;
        for(int f : freq){
            if(f%2!=0){
                odd++;
            }
        }
        return odd<=k;
    }
}
