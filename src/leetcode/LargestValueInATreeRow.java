package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestValueInATreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer>ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode>q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            int maxInLevel = Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode temp = q.poll();
                maxInLevel = Math.max(maxInLevel,temp.val);
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            ans.add(maxInLevel);
        }
        return ans;
    }
}
