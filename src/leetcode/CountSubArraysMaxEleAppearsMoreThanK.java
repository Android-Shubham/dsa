package leetcode;

public class CountSubArraysMaxEleAppearsMoreThanK {
    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            max = Math.max(max,num);
        }
        long ans = 0;
        int left = 0;
        int n = nums.length;
        int window = 0;
        for(int right = 0;right<n;right++){
            if(nums[right] == max){
                window++;
            }
            while(left<=right && window==k){
                ans+=n-right;
                if(nums[left] == max){
                    window--;
                }
                left++;
            }
        }
        return ans;
    }
}
