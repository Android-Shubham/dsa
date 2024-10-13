package algomap.io.ArryasAndStrings;

//https://leetcode.com/problems/find-closest-number-to-zero/description/
public class ClosestNumberToZero {
    public static void main(String[] args) {
        System.out.println(closestNumberToZero(new int[]{2,1,-1}));
    }

    private static int closestNumberToZero(int[] nums) {
        int res = 0;
        int min = Integer.MAX_VALUE;
        for(int num : nums){
            if(Math.abs(num) < min){
                min = Math.abs(num);
                res = num;
            }else if(Math.abs(num) == min){
                res = Math.max(res, num);
            }

        }
        return res;
    }
}
