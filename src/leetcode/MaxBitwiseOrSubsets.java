package leetcode;

public class MaxBitwiseOrSubsets {

    public static void main(String[] args) {
        MaxBitwiseOrSubsets maxBitwiseOrSubsets = new MaxBitwiseOrSubsets();
        System.out.println(maxBitwiseOrSubsets.countMaxOrSubsets(new int[]{3,2,1,5}));
    }
    public int countMaxOrSubsets(int[] nums) {
        int target = nums[0];
        for(int i=1;i<nums.length;i++){
            target|=nums[i];
        }

        return maxSubSets(nums,0,0,target);
    }
    private int maxSubSets(int[] nums, int index, int curOr,int target){
        if(index == nums.length){
            return target==curOr?1:0;
        }
        int without = maxSubSets(nums,index+1,curOr,target);
        int with = maxSubSets(nums,index+1,curOr | nums[index],target);
        return with + without;
    }
}
