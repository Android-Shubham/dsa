package algomap.io.ArryasAndStrings;

//https://leetcode.com/problems/rotate-string/description/
public class RotateString {


    public boolean rotateString_betterSolution(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        return (s + s).contains(goal);
    }

    public boolean rotateString_mySolution(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        int n = s.length();
        s = s+s;
        int l=0;
        while(l<=n){
            if(s.charAt(l)==goal.charAt(0)){
                if(find(s,goal,l,n)){
                    return true;
                }
            }
            l++;
        }
        return false;
    }

    private boolean find(String s,String goal,int l,int n){
        int r=0;
        while(r<n && l<n+n){
            if(s.charAt(l++)!=goal.charAt(r++)){
                return false;
            }
        }

        return true;
    }
}
