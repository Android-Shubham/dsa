package algomap.io;

//https://leetcode.com/problems/is-subsequence/
public class IsSubsequence {

    public static void main(String[] args) {
        IsSubsequence isSubsequence = new IsSubsequence();
        System.out.println(isSubsequence.isSubsequence("abc","axc"));
    }
    private boolean isSubsequence(String s, String t){
        int i=0,j=0;
        while (i<s.length()){
            char ch = s.charAt(i);
            while (j<t.length() && t.charAt(j)!=ch){
                j++;
            }
            if(j==t.length()){
                return false;
            }
            j++;
            i++;
        }

        return true;
    }
}
