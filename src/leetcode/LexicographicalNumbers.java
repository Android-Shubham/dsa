package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LexicographicalNumbers {
    public static void main(String[] args) {
        System.out.println(lexicalOrder(13));
    }

    public static List<Integer> lexicalOrder(int n) {
        List<Integer>res = new ArrayList<>();
        res.add(1);
        while(res.size()<n){
            int cur = res.get(res.size()-1);
            if(cur*10<=n){
                res.add(cur*10);
                continue;
            }
            while (cur%10 == 9 || cur + 1>n){
                cur/=10;
            }
            res.add(cur+1);
        }
        return res;
    }
}
