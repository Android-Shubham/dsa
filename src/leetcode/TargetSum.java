package leetcode;

import java.util.ArrayList;

public class TargetSum {

    public static void main(String[] args) {
        TargetSum targetSum = new TargetSum();
        System.out.println(targetSum.findTargetSumWays(new int[]{1,1,1,1,1}, 3));
    }
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        backtrack(nums,target,0,0);
        return count;
    }
    private void backtrack(int[] nums,int target,int index,int curSum){
        if(index == nums.length){
            if(curSum == target){
                count++;
            }
            return;
        }
        backtrack(nums,target,index+1,curSum+nums[index]);
        backtrack(nums,target,index+1,curSum-nums[index]);

    }
}
