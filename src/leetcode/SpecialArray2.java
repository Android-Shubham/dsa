package leetcode;

public class SpecialArray2 {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] pre = new int[n];
        for(int i=1;i<n;i++){
            if( (nums[i-1]%2) == (nums[i]%2) ){
                pre[i] = pre[i-1]+1;
            }else{
                pre[i] = pre[i-1];
            }
        }
        boolean[] ans = new boolean[queries.length];
        for(int i=0;i<queries.length;i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            ans[i] = (pre[start]-pre[end]==0);
        }
        return ans;
    }
}
