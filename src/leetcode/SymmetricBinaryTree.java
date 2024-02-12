package leetcode;

import java.util.HashMap;

public class SymmetricBinaryTree {




    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetricRec(root.left, root.right);
    }

    public static boolean isSymmetricRec(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val != right.val) {
            return false;
        }
        return isSymmetricRec(left.left, right.right) && isSymmetricRec(right.left, left.right);
    }

    public int majorityElement(int[] nums) {
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(!map.containsKey(num)){
                map.put(num,0);
            }
           map.put(num,map.get(num)+1);
        }




        return res;
    }
}
