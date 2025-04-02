package leetcode;

public class MaxValueOfAnOrderedTriplet {
    public static void main(String[] args) {
        MaxValueOfAnOrderedTriplet max = new MaxValueOfAnOrderedTriplet();
        System.out.println(max.maximumTripletValue(new int[]{12, 6, 1, 2, 7}));
    }
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = nums[0];
        right[n-1] = nums[n-1];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1],nums[i]);
            right[n-i-1] = Math.max(right[n-i],nums[n-i-1]);
        }
        long res = 0;
        for(int j=1;j<n-1;j++){
            res = Math.max(res,(long)(left[j-1] - nums[j])*right[j+1]);
        }
        return res;
    }
}
