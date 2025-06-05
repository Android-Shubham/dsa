package greedy;

public class JumpGame2 {
    public int jump(int[] nums) {
        int end = 0;
        int maxI = 0;
        int minJ = 0;
        int n = nums.length;
        for(int i=0;i<n-1;i++){
            maxI = Math.max(maxI,i+nums[i]);
            if(end == i){
                end = maxI;
                minJ++;
            }
            if(end>=n-1){
                return minJ;
            }
        }
        return minJ;
    }
}
