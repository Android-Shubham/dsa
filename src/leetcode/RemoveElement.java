package leetcode;

import java.util.HashSet;
import java.util.Set;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{2,3,3,2},3));
    }

    public static int removeElement(int[] nums, int val) {
        int[] temp = new int[nums.length];

        int index = 0;
        for(int i = 0 ;i <nums.length ; i++){
            if(nums[i] != val){
                temp[index++] = nums[i];
            }
            nums[i] = 0;
        }
        for(int i =0;i<temp.length;i++){
            nums[i] = temp[i];
        }

        return index;
    }
}
