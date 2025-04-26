package leetcode;

public class CountSubArraysWithFixBounds {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans = 0;
        int min = -1;
        int max = -1;
        int start = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] == minK){
                min = i;
            }
            if(nums[i] == maxK){
                max = i;
            }
            if(nums[i]<minK || nums[i]>maxK){
                start = i+1;
            }
            if(min == -1 || max ==-1){
                continue;
            }
            int count = Math.min(min,max) - start + 1;
            if(count>0){
                ans+=count;
            }
        }
        return ans;
    }
}
