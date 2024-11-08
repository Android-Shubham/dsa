package bitmanipulation;

public class MaxXorOfEachQuery {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int maxXor = 0;
        int n = nums.length;
        for(int num : nums){
            maxXor^=num;
        }
        int maxBit = (1 << maximumBit) - 1;
        int[] res = new int[n];
        for(int i=0;i<n;i++){
            res[i] = Math.abs(maxXor-maxBit);
            maxXor^=nums[n-i-1];
        }
        return res;
    }
}
