package binarysearch;

public class HouseRobber4 {
    public int minCapability(int[] nums, int k) {
        int start = Integer.MAX_VALUE;
        int end = Integer.MIN_VALUE;
        for(int num : nums){
            start = Math.min(start,num);
            end = Math.max(end,num);
        }
        int ans = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(canRob(nums,mid,k)){
                ans = mid;
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return ans;
    }

    private boolean canRob(int[] nums,int mid,int k){
        int houses=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=mid){
                houses++;
                i++;
            }
            if(houses==k){
                return true;
            }
        }
        return false;
    }
}
