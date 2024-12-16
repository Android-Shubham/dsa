package leetcode;

public class ContinuousSubarrays {

    public long continuousSubarrays(int[] nums) {
        int start = 0;
        int end = 0;
        long count = 0;
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        while(end<n){
            min = Math.min(min,nums[end]);
            max = Math.max(max,nums[end]);
            if(max - min > 2){
                start = end;
                max = nums[end];
                min = nums[end];
                while(start - 1 !=0 && Math.abs(nums[start-1]-nums[end])<=2){
                    start--;
                    min = Math.min(min,nums[start]);
                    max = Math.max(max,nums[start]);
                }
            }
            count+=(end - start + 1);
            end++;
        }
        return count;
    }
}
