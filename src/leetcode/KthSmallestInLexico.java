package leetcode;

import java.util.ArrayList;

public class KthSmallestInLexico {
    public static void main(String[] args) {
        KthSmallestInLexico kthSmallestInLexico = new KthSmallestInLexico();
        System.out.println(kthSmallestInLexico.findKthNumber(100,90));

        System.out.println(kthSmallestInLexico.findKthNumber(9885387,8786251));
    }
    int k;
    int ans = 1;
    public int findKthNumber(int n, int k) {
        this.k = k;
        for (int i = 1; i <= 9; i++) {
             dfs(i, n);
        }
        return ans;
    }

    private void dfs(int cur, int n) {
        if (k > 0) {
            k--;
            if(k == 0){
                ans = cur;
            }
            for (int i = 0; i <= 9; i++) {
                int next = cur * 10 + i;
                if (next > n)
                    break;
                dfs(next, n);
            }
        }
    }
}
