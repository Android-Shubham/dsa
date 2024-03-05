package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class UniqueIntegersAfterK {
    public static void main(String[] args) {
        System.out.println(findLeastNumOfUniqueInts(new int[]{4,5,5},1));
    }

    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0;
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        ArrayList<Integer> count = new ArrayList<>();


        map.forEach((key,value) ->{
            count.add(value);
        });
        Collections.sort(count);
        int index = 0;
        while(k>0){
            if(count.get(index) < k){
                k-=count.get(index);
                count.set(index, 0);
            }else{
                count.set(index, count.get(index) -k);
                k = 0;
            }
            index++;
        }

        for(int num : count){
            if(num>0){
                res++;
            }
        }

        return res;
    }
}
