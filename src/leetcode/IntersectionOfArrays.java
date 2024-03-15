package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IntersectionOfArrays {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intersection(new int[]{4,9,5}, new int[]{4,4,8,9,9})));
    }


    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = nums1.length - 1;
        int j = nums2.length - 1;
        while(i>=0 && j>=0){
            if(nums1[i] == nums2[j]){
                res.add(nums1[i]);
                i--;
                j--;
            }else if(nums1[i]>nums2[j]){
                i--;
            }else{
                j--;
            }
        }
        int[] result = new int[res.size()];

        i = 0;
        for (Integer re : res) {
            result[i++] = re;
        }

        return result;
    }
}
