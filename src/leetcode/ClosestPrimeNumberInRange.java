package leetcode;

import java.util.ArrayList;

public class ClosestPrimeNumberInRange {
    public int[] closestPrimes_bruteforce(int left, int right) {
        ArrayList<Integer> primes = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(i<2){
                continue;
            }
            boolean found = false;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    found  = true;
                    break;
                }
            }
            if(!found){
                primes.add(i);
            }
        }
        int n = primes.size();
        if(n<2) return new int[]{-1,-1};
        int[] diff = new int[n];
        int min = Integer.MAX_VALUE;
        int[] res = new int[2];
        for(int i=1;i<n;i++){
            diff[i] = primes.get(i) - primes.get(i-1);
            if(min>diff[i]){
                res[0] = primes.get(i-1);
                res[1] = primes.get(i);
                min = diff[i];
            }
        }
        return res;
    }
}
