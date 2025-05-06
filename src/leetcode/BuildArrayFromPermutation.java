package leetcode;

public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            nums[i]+=(1024 * (nums[nums[i]]%1024));
        }
        for(int i=0;i<n;i++){
            nums[i]/=1024;
        }
        return nums;
    }
}
