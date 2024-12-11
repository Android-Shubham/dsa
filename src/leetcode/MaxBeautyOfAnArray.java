package leetcode;

public class MaxBeautyOfAnArray {
    public int maximumBeauty(int[] nums, int k) {
        if(nums.length == 1) return 1;
        int max = 0;
        for(int num : nums){
            max = Math.max(num,max);
        }
        int[] pre = new int[max+1];
        for(int num : nums){
            pre[Math.max(num-k,0)]++;
            pre[Math.min(num+k+1,max)]--;
        }
        int maxBeauty = 0;
        int curSum = 0;
        for(int num : pre){
            curSum+=num;
            maxBeauty = Math.max(curSum,maxBeauty);
        }
        return maxBeauty;
    }
}
