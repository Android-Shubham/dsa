package algomap.io.dp;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int jump = n - 1;
        for(int i=n-1;i>=0;i--){
            if((i+nums[i])>=jump){
                jump = i;
            }
        }
        return jump == 0;
    }
}
