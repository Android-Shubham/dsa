package leetcode;

public class SumOfAllSubsetXors {
    public int subsetXORSum(int[] nums) {
        return backtrack(nums,0,0);
    }
    private int backtrack(int[] nums,int index,int cur){
        if(index==nums.length){
            return cur;
        }
        int pick = backtrack(nums,index+1,cur^nums[index]);
        int notPick = backtrack(nums,index+1,cur);
        return pick+notPick;
    }
}
