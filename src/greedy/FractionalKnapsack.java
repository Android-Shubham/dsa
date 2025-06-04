package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        FractionalKnapsack fractionalKnapsack = new FractionalKnapsack();
        System.out.println(fractionalKnapsack.fractionalKnapsack(new int[]{60,100,120},new int[]{10,20,30},50));
    }
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        // code here
        int n = values.length;
        double[][] fracs = new double[n][2];
        for(int i=0;i<n;i++){
            fracs[i] = new double[]{weights[i], (double) values[i] /weights[i]};
        }
        Arrays.sort(fracs,new Comparator<>(){
            @Override
            public int compare(double[] a, double[] b) {
                return Double.compare(b[1],a[1]);
            }
        });
        double ans = 0;
        int i = 0;
        while(W>0 && i<n){
            if(fracs[i][0] <= W){
                ans+=(fracs[i][0] * fracs[i][1]);
            }else{
                ans+=(fracs[i][1] * W);

            }
            W-= (int) fracs[i][0];
            ++i;
        }
        return ans;
    }
}
