package algomap.io.dp;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n<=3) return n;
        int first = 1;
        int second = 2;
        int ans = 0;
        for(int i=3;i<=n;i++){
            ans = first + second;
            first = second;
            second = ans;
        }
        return ans;
    }
}
