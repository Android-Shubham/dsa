package leetcode;

public class MinimumRecolor {
    public int minimumRecolors(String blocks, int k) {
        int w = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                w++;
            }
        }
        int ans = w;
        int j=1;
        int n=blocks.length();
        while(j<=n-k){
            if(blocks.charAt(j+k-1)=='W'){
                w++;
            }
            if(blocks.charAt(j-1)=='W'){
                w--;
            }
            ans = Math.min(ans,w);
            j++;
        }
        return ans;
    }
}
