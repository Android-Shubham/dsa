package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SequentialDigits {
    public static void main(String[] args) {
        sequentialDigits(1000,13000);
    }


    public static List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        int start = String.valueOf(low).length();
        int end = String.valueOf(high).length();
        String max = "123456789";
        for(int window=start;window<=end;window++){
            int i = 0;
            int j = window ;
            while(j<=max.length()){
                int num = Integer.parseInt(max.substring(i++,j++));
                if(num > low && num < high){
                    res.add(num);
                }
            }
        }

        return res;
    }
}
