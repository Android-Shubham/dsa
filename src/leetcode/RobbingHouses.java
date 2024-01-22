package leetcode;

import java.util.Arrays;

public class RobbingHouses {

    public static void main(String[] args) {
        rob(new int[]{1,2,3,1});
    }

    static int[] memo = new int[101];
    public static int rob(int[] nums) {
        Arrays.fill(memo,-1);
        return rob(nums,0);
    }

    private static int rob(int[] nums,int index){
        if(index>=nums.length){
            return 0;
        }
        if(memo[index]!=-1){
            return memo[index];
        }

        int skipped = rob(nums,index + 1);
        int robbed = nums[index] + rob(nums,index+2);
        return memo[index] = Math.max(skipped,robbed);
    }
}
