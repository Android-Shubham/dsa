package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LargestValueInATreeRow {

    //bfs
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



    //dfs
    List<Integer>ans = new ArrayList<>();
    public List<Integer> largestValues_dfs(TreeNode root) {
        dfs(root,0);
        return ans;
    }
    private void dfs(TreeNode root,int level){
        if(root==null){
            return;
        }
        if(level == ans.size()){
            ans.add(root.val);
        }else{
            ans.set(level,Math.max(ans.get(level),root.val));
        }
        dfs(root.left,level+1);
        dfs(root.right,level+1);
    }

}
