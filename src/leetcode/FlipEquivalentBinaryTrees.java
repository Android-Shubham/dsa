package leetcode;

public class FlipEquivalentBinaryTrees {


    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        return compare(root1,root2);
    }
    private boolean compare(TreeNode root1,TreeNode root2){
        if(root1==null || root2==null){
            return root1 == root2;
        }
        if(root1.val != root2.val){
            return false;
        }

        if(root1.left == null && root2.left ==null){
            return compare(root1.right,root2.right);
        }else if(root1.right == null && root2.right ==null){
            return compare(root1.left,root2.left);
        }else if(root1.left!=null && root2.left!=null && root1.left.val == root2.left.val){
            boolean left = compare(root1.left,root2.left);
            boolean right = compare(root1.right,root2.right);
            return left & right;
        }else {
            boolean left = compare(root1.right,root2.left);
            boolean right = compare(root1.left,root2.right);
            return left & right;
        }
    }
}
