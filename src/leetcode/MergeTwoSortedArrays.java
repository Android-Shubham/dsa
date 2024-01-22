package leetcode;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0},3,new int[]{2,3,5},3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;
        while(n > 0){

            if(m > 0 && nums1[m-1] > nums2[n-1]){
                nums1[index] = nums1[m-1];
                m--;
            }else{
                nums1[index] = nums2[n-1];
                n--;
            }

            index--;
        }


        System.out.println(Arrays.toString(nums1));
    }
}
