package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


class Pair {
    int num;
    int index;

    public Pair(int num, int index) {
        this.num = num;
        this.index = index;
    }
}

public class RankTransformOfAnArray {

    public static void main(String[] args) {
        RankTransformOfAnArray rankTransformOfAnArray = new RankTransformOfAnArray();
        System.out.println(Arrays.toString(rankTransformOfAnArray.arrayRankTransform(new int[]{100, 100, 100})));
    }

    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;
        for (int num : arr) {
            temp[index++] = num;
        }
        Arrays.sort(temp);
        ArrayList<Pair> list = new ArrayList<>();
        index = 0;
        int i = 0;
        while (i < n) {
            int num = temp[i];
            list.add(new Pair(num, ++index));
            while (i < n && temp[i] == num) {
                i++;
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Pair pair : list) {
            map.put(pair.num, pair.index);
        }
        int[] res = new int[n];
        index = 0;
        for (int num : arr) {
            res[index++] = map.get(num);
        }
        return res;
    }


    public int[] arrayRankTransform2(int[] arr) {
        int n = arr.length;
        int[] sorted = new int[n];
        int index = 0;
        for (int num : arr) {
            sorted[index++] = num;
        }
        Arrays.sort(sorted);
        HashMap<Integer, Integer> map = new HashMap<>();
        index = 0;
        int i = 0;
        while (i < n) {
            int num = sorted[i];
            map.put(num,++index);
            while(i<n && sorted[i]==num){
                i++;
            }
        }

        index = 0;
        for(int num : arr){
            sorted[index++] = map.get(num);
        }
        return sorted;
    }
}
