package leetcode;

import java.util.Arrays;

public class PartitionArray {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums); //nlogn
        int i=0; // O(1)
        int j=0; // O(1)
        int n = nums.length; // O(1)
        int ans = 0; // O(1)
        while(j<n){ //O(n)
            if(nums[j] - nums[i] <= k){
                ans++;
                while(j<n && nums[j] - nums[i] <= k){
                    j++;
                }
            }
            i=j;
        }
        return ans;
    }
}
