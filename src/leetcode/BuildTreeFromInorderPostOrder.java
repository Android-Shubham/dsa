package leetcode;

import java.util.HashMap;

public class BuildTreeFromInorderPostOrder {
    public static void main(String[] args) {
        buildTree(new int[]{9,3,15,20,7},new int[]{9,15,7,20,3});
    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        int n = inorder.length - 1;
        int m = postorder.length - 1;
        TreeNode root = constructTree(inorder,postorder,map,0,m,0,n);
        return root;
    }

    private static TreeNode constructTree(int[] inorder, int[] postorder,HashMap<Integer,Integer>map,int postStart,int postEnd,int inStart,int inEnd){
        if(postEnd<postStart || inEnd<inStart){
            return null;
        }
        int rootData = postorder[postEnd];
        int rootIndex = map.get(rootData);
        TreeNode root = new TreeNode(rootData);
        int left = rootIndex - inStart;
        int right = inEnd - rootIndex;

        root.left = constructTree(inorder,postorder,map,postStart,postStart + left - 1,inStart,rootIndex - 1);
        root.right = constructTree(inorder,postorder,map,postStart + left,postStart+left+right-1,rootIndex + 1,inEnd);
        return root;
    }
}
