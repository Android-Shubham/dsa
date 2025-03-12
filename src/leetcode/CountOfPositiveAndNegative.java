package leetcode;

public class CountOfPositiveAndNegative {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int pos = n-upperbound(nums,n);
        int neg = lowerbound(nums,n);
        return Math.max(pos,neg);
    }

    private int lowerbound(int[] nums,int n){
        int start = 0;
        int end = n-1;
        int index = n;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(nums[mid]<0){
                start = mid+1;
            }else if(nums[mid]>=0){
                end = mid - 1;
                index = mid;
            }
        }
        return index;
    }

    private int upperbound(int[] nums,int n){
        int start = 0;
        int end = n-1;
        int index = n;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(nums[mid]<=0){
                start = mid+1;
            }else{
                end = mid - 1;
                index = mid;
            }
        }
        return index;
    }
}
