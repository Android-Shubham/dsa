package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class JobSequencing {
    public static void main(String[] args) {
        JobSequencing jobSequencing = new JobSequencing();
        System.out.println(jobSequencing.jobSequencing(new int[]{2,1,2,1,1},new int[]{100,19,27,25,15}));
    }
    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        // code here
        int maxDead = 0;
        for(int dead :  deadline){
            maxDead = Math.max(maxDead,dead);
        }
        int[] jobs = new int[maxDead+1];
        Arrays.fill(jobs,-1);
        int n = profit.length;
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0] = deadline[i];
            arr[i][1] = profit[i];
        }
        Arrays.sort(arr,new Comparator<>(){
            @Override
            public int compare(int[] a,int[] b){
                return Integer.compare(b[1],a[1]);
            }
        });
        for(int i=0;i<n;i++){
            int profit_cur = arr[i][1];
            int dead = arr[i][0];
            for(int j=dead;j>0;j--){
                if(jobs[j] == -1){
                    jobs[j] = profit_cur;
                    break;
                }
            }
        }
        int total = 0;
        int maxP = 0;
        for(int i=1;i<=maxDead;i++){
            if(jobs[i] != -1){
                total++;
                maxP+=jobs[i];
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(total);
        ans.add(maxP);
        return ans;
    }
}
