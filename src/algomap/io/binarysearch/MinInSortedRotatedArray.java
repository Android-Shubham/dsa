package algomap.io.binarysearch;

public class MinInSortedRotatedArray {

    public static void main(String[] args) {
        MinInSortedRotatedArray minInSortedRotatedArray = new MinInSortedRotatedArray();
        System.out.println(minInSortedRotatedArray.findMin(new int[]{4,5,6,7,0,1,2}));
    }
    public int findMin(int[] nums) {
        int left = 0,right=nums.length - 1;
        while(left<right){
            int mid = (right + left) / 2;
            if(nums[mid]>nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return nums[left];
    }
}
