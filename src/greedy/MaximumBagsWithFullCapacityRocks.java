package greedy;

import java.util.Arrays;

public class MaximumBagsWithFullCapacityRocks {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = capacity.length;
        int[] consume = new int[n];
        for(int i=0;i<n;i++){
            consume[i] = capacity[i] - rocks[i];
        }
        Arrays.sort(consume);
        int ans = 0;
        for(int i=0;i<n && additionalRocks>0;i++){
            if(additionalRocks >= consume[i]){
                ans++;
                additionalRocks-=consume[i];
            }else{
                additionalRocks = 0;
            }
        }
        return ans;
    }
}
