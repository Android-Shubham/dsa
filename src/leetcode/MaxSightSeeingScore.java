package leetcode;

public class MaxSightSeeingScore {
    public int maxScoreSightseeingPair(int[] values) {
        int max = 0;
        int n = values.length;
        int maxi = values[0];
        for(int i=1;i<n;i++){
            int maxj = values[i]-i;
            max = Math.max(max,maxi+maxj);
            maxi = Math.max(maxi,values[i] + i);
        }
        return max;
    }
}
