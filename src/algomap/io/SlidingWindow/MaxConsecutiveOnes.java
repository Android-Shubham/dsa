package algomap.io.SlidingWindow;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        System.out.println(maxConsecutiveOnes.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0}, 2));
    }

    public int longestOnes(int[] nums, int k) {
        int zeroes = 0;
        int start = 0;
        int end = 0;
        int n = nums.length;
        int max = 0;
        while(start<n && end<n){
            if(start>0 && nums[start-1]==0){
                zeroes--;
            }
            while(end<n && (zeroes<k||nums[end]!=0)){
                if(nums[end] == 0){
                    zeroes++;
                }
                end++;
            }
            max = Math.max(max,end - start);
            start++;
        }
        return max;
    }
}
