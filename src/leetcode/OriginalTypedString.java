package leetcode;

public class OriginalTypedString {
    public int possibleStringCount(String word) {
        int ans = 1;
        int i = 0;
        int n = word.length();
        while(i<n){
            char ch = word.charAt(i);
            int j = i+1;
            while(j<n && word.charAt(j) == ch){
                j++;
            }
            ans += (j-i-1);
            i = j;
        }
        return ans;
    }
}
