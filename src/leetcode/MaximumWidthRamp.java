package leetcode;

import java.util.Stack;

//https://leetcode.com/problems/maximum-width-ramp
public class MaximumWidthRamp {
    public static void main(String[] args) {
        MaximumWidthRamp maximumWidthRamp = new MaximumWidthRamp();
        System.out.println(maximumWidthRamp.maxWidthRamp(new int[]{6,0,8,2,1,5}));
    }
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            if(stack.isEmpty() || nums[stack.peek()]>nums[i]){
                stack.push(i);
            }
        }
        int width = 0;
        for (int i=nums.length-1;i>=0;i--){
            while (!stack.isEmpty() && nums[stack.peek()]<=nums[i]){
                width = Math.max(width, i - stack.pop());
            }
            if(stack.isEmpty()){
                break;
            }
        }

        return width;
     }
}
