package leetcode;

import java.util.ArrayList;
import java.util.Collections;

public class MinSum {
    public static void main(String[] args) {
        MinSum minSum = new MinSum();
        System.out.println(minSum.splitNum(4325));
    }
    public int splitNum(int num) {
        ArrayList<Integer> cur = new ArrayList<>();
        while(num > 0){
            cur.add(num%10);
            num/=10;
        }
        Collections.sort(cur);
        int num1 = 0;
        int num2 = 0;
        int n = cur.size();
        for(int i=0;i<n;i+=2){
            num1 = (num1 * 10) + cur.get(i);
            if(i+1<n){
                num2 = (num2 * 10) + cur.get(i+1);
            }
        }
        return num1 + num2;
    }
}
