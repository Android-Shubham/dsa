package leetcode;

import java.util.Arrays;

public class PerfectSquares {
    static int[] dp = new int[10000];
    public static void main(String[] args) {
        Arrays.fill(dp,-1);
        numSquares(13);
    }

    public static int numSquares(int n) {
        int res = n, num = 2;
        if(dp[n]!=-1){
            return dp[n];
        }
        while (num * num <= n) {
            int x = n / (num * num), y = n % (num * num);
            res = Math.min(res, x + numSquares(y));
            ++num;
        }
        System.out.println("num n="+n+"---"+"res="+res);
        return dp[n]=res;
    }
}
