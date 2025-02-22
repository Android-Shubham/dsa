package leetcode;

public class RecoverATreeFromPreorder {
    int index = 0;
    int n = 0;
    public TreeNode recoverFromPreorder(String traversal) {
        n = traversal.length();
        return trav(traversal,0);
    }
    private TreeNode trav(String t,int depth){
        if(index>=n) return null;
        int temp = index;
        int count = 0;
        while(temp<n && !Character.isDigit(t.charAt(temp))){
            temp++;
            count++;
        }
        if(count!=depth) return null;
        index = temp;
        int val = 0;
        while(index<n && Character.isDigit(t.charAt(index))){
            val = (val*10)+(t.charAt(index)-'0');
            index++;
        }
        TreeNode root = new TreeNode(val);
        root.left = trav(t,depth+1);
        root.right = trav(t,depth+1);
        return root;
    }
}
