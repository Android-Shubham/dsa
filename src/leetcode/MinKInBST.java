package leetcode;

public class MinKInBST {

    public static void main(String[] args) {
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(1);
        node.right = new TreeNode(4);
        node.left.right = new TreeNode(2);
        System.out.println(kthSmallest(node));
    }

    static int res = 0;
    static int k = 1;

    public static int kthSmallest(TreeNode root) {

        traverseTree(root);

        return res;
    }

    private static void traverseTree(TreeNode root) {
        if (root == null || k < 1) {
            return;
        }

        traverseTree(root.left);
        if(k>0) {
            res = root.val;
            k--;
            traverseTree(root.right);
        }
    }
}
