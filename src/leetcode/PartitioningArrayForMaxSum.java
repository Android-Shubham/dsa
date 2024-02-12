package leetcode;

import java.util.Arrays;

public class PartitioningArrayForMaxSum {

    public static void main(String[] args) {
        System.out.println(maxSumAfterPartitioning(new int[]{1,15,7,9,2,5,10},3));
    }
    public static int maxSumAfterPartitioning(int[] arr, int k) {
        dp = new int[arr.length];
        Arrays.fill(dp,-1);
        return helper(arr,k,0);
    }
    static int[] dp;
    private static int helper(int[] arr, int k, int start) {
        int len = arr.length;
        if(start>=len){
            return 0;
        }
        if(dp[start]!=-1) {
            return dp[start];
        }
        int ans = 0;
        int curMax = 0;
        int end = Math.max(start+k,len);

        for (int i = start; i < end; i++) {
            curMax = Math.max(curMax,arr[i]);
            ans = Math.max(ans,curMax * (i-start + 1) + helper(arr,k,i+1));
        }


        return dp[start] = ans;
    }
}
