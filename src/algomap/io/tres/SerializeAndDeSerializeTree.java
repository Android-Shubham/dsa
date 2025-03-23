package algomap.io.tres;

import leetcode.TreeNode;

public class SerializeAndDeSerializeTree {
    StringBuilder preorder;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        preorder = new StringBuilder();
        helper(root);
        return preorder.toString();
    }

    private void helper(TreeNode root){
        if(root==null){
            preorder.append("N").append(",");
            return;
        }
        preorder.append(root.val).append(",");
        helper(root.left);
        helper(root.right);
    }

    // Decodes your encoded data to tree.
    int index;
    public TreeNode deserialize(String data) {
        String[] pre = data.split(",");
        index=0;
        return buildTree(pre);
    }
    private TreeNode buildTree(String[] pre){
        if(pre[index].equals("N")){
            index++;
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(pre[index]));
        index++;
        root.left = buildTree(pre);
        root.right = buildTree(pre);
        return root;
    }
}
