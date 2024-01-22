package leetcode;

import java.util.ArrayList;
import java.util.List;

public class TwoDUniqueList {
    public static void main(String[] args) {
        System.out.println(findMatrix(new int[]{1,3,4,1,2,3,1}));
    }

    public static List<List<Integer>> findMatrix(int[] nums) {
        int max = 0;
        int[] freq = new int[201];
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            freq[nums[i]]++;
            max = Math.max(max,freq[nums[i]]);
        }
        int i = 1;
        while(i<=max){
            List<Integer> list = new ArrayList<>();

            for(int j=0;j<201;j++){
                if(freq[j]>=i){
                    list.add(j);
                }
            }

            if(list.size()!=0){
                res.add(list);
            }

            i++;
        }

        return res;
    }

    private static List<Integer> getUniqueArray(List<Integer> nums) {
        List<Integer> uniqueArray = new ArrayList<>();
        for (int num : nums) {
            if (!uniqueArray.contains(num)) {
                uniqueArray.add(num);
            }
        }

        for (Integer integer : uniqueArray) {
            if (nums.contains(integer)) {
                nums.remove(integer);
            }
        }

        return uniqueArray;
    }

}
