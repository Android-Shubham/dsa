package leetcode;

import java.util.Arrays;

public class DividePlayers {

    public static void main(String[] args) {
        DividePlayers dividePlayers = new DividePlayers();
        System.out.println(dividePlayers.dividePlayers(new int[]{3,2,5,1,3,4}));
    }
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        Arrays.sort(skill);
        long res = 0;
        int sum = skill[0] + skill[n - 1];
        for(int i=0;i<n/2;i++){
            if(skill[i] + skill[n-1-i]!=sum){
                return -1;
            }
            res+=((long) skill[i] *skill[n-i-1]);
        }
        return res;
    }
}
