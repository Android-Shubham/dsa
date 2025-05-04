package leetcode;

public class EquivalentDominoPairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        int pairs = 0;
        int[] count = new int[100];
        for(int[] domino : dominoes){
            int val = domino[0] < domino[1]?(domino[0]*10) + domino[1] : (domino[1]*10) + domino[0];
            pairs+=count[val];
            count[val]++;
        }
        return pairs;
    }
}
