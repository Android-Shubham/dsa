package binarysearch;

public class BSUsingRecursion {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10,11},0,10,1100));
    }

    private static int binarySearch(int[] nums, int start, int end, int target) {
        if(start>end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(nums[mid]==target){
            return mid;
        }
        if(target>nums[mid]){
            return binarySearch(nums,mid+1,end,target);
        }

        return binarySearch(nums,start,mid-1,target);
    }
}
