package leetcode;

import java.util.Arrays;

public class DivideArrayWithMaxDiff {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divideArray(new int[]{1,3,4,8,7,9,3,5,1},2)));
    }

    public static int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        if(n%3 != 0){
            return new int[][]{};
        }
        int[][] res = new int[n/3][3];

        for(int i=0;i<n - 2;i+=3){
            if((nums[i+2] - nums[i])>k){
                return new int[][]{};
            }
        }

        for(int i=0;i<n;i++){
           res[(i) / 3][(i) % 3] = nums[i];
        }


        return res;
    }
}
