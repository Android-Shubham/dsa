package algomap.io.tres;

import leetcode.TreeNode;

public class MaximumPathSum {
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        findMax(root);
        return ans;
    }

    private int findMax(TreeNode root){
        if(root==null) return 0;
        int cur = root.val;
        int left = Math.max(0,findMax(root.left));
        int right = Math.max(0,findMax(root.right));
        ans = Math.max(cur+left+right,ans);
        return cur + Math.max(left,right);
    }
}
