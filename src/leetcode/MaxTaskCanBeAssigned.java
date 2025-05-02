package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class MaxTaskCanBeAssigned {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        int n = tasks.length;
        Arrays.sort(tasks);
        Arrays.sort(workers);

        int ans = 0;
        for(int i=0;i<n;i++){
            if(tasks[i]<=workers[i]){
                ans++;
                continue;
            }
            if(pills>0 && workers[i] + strength>=tasks[i]){
                pills--;
                ans++;
                continue;
            }
        }
        return ans;
    }
}
