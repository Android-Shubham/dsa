package leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3,2,2,3},3));
    }

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length - 1;
        int lastSwap = 0;
        while(i<j){
            if(nums[j]==val){
                j--;
                continue;
            }
            if(nums[i]!=val){
                i++;
                continue;
            }
            nums[i++] = nums[j--];
        }

        return i+1;
    }
}
