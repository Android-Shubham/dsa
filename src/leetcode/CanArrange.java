package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CanArrange {

    public static void main(String[] args) {
        CanArrange canArrange = new CanArrange();
        System.out.println(canArrange.canArrangeOptimised(new int[]{1,2,3,4,5,10,6,7,8,9},5));
    }
    public boolean canArrange(int[] arr, int k) {
        Map<Integer, Integer> remainderCount = new HashMap<>();

        // Store the count of remainders in a map.
        for (int i : arr) {
            int rem = ((i % k) + k) % k;
            remainderCount.put(rem, remainderCount.getOrDefault(rem, 0) + 1);
        }

        for (int i : arr) {
            int rem = ((i % k) + k) % k;

            // If the remainder for an element is 0, then the count
            // of numbers that give this remainder must be even.
            if (rem == 0) {
                if (remainderCount.get(rem) % 2 == 1) return false;
            }
            // If the remainder rem and k-rem do not have the
            // same count then pairs can not be made.
            else if (
                    !Objects.equals(
                            remainderCount.get(rem),
                            remainderCount.get(k - rem)
                    )
            ) return false;
        }
        return true;
    }

    public boolean canArrangeOptimised(int[] arr, int k) {
        int[] map = new int[k];
        for(int element : arr){
            int rem = ((element % k) + k) % k;
            map[rem]++;
        }
        if(map[0]%2!=0){
            return false;
        }
        for(int rem = 1;rem<=k/2;rem++){
            int comp = k - rem;
            if(map[rem]!=map[comp]){
                return false;
            }
        }
        return true;
    }
}
