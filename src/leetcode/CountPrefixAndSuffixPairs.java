package leetcode;

public class CountPrefixAndSuffixPairs {
    public int countPrefixSuffixPairs(String[] words) {
        int n=words.length;
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(isPrefixAndSuffix(words[i],words[j])){
                    ans++;
                }
            }
        }

        return ans;
    }

    private boolean isPrefixAndSuffix(String s1,String s2){
        int i=0;
        int n = s2.length();
        int m = s1.length();
        if(m>n) return false;
        while(i<m){
            if(s1.charAt(i) != s2.charAt(i) || s1.charAt(i)!=s2.charAt(n-m+i)){
                return false;
            }
            i++;
        }
        return true;
    }
}
