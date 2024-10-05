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

    public long dividePlayersOptimized(int[] skill) {
        int target = 0;
        int n = skill.length / 2;
        int[] map = new int[1001];
        for(int s : skill){
            target+=s;
            map[s]++;
        }
        if(target%n!=0){
            return -1;
        }
        target/=n;
        long res = 0;
        for(int s : skill){
            if(map[s]>0){
                if(map[target-s]<1){
                    return -1;
                }
                map[s]--;
                res+=(s * (target-s));
                map[target-s]--;
            }
        }

        return res;
    }
}
