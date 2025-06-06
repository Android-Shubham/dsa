package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LengthAfterTransformations {
    public static void main(String[] args) {
        LengthAfterTransformations lengthAfterTransformations = new LengthAfterTransformations();
        lengthAfterTransformations.lengthAfterTransformations("abcyy", 2);
    }
    private static final int MOD = 1000000007;
    public int lengthAfterTransformations(String s, int t) {
        int[] arr = new int[26];
        for (char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }

        int[][] intervals = new int[5][5];
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return Integer.compare(a[0],b[0]);
            }
        });

        while (t > 0) {
            int[] temp = new int[26];
            temp[0] = arr[25];
            temp[1] = (arr[25] + arr[0])%MOD;
            for (int i = 2; i < 26; i++) {
                temp[i] = arr[i-1];
            }
            arr = temp;
            t--;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            count = (count +arr[i]) % MOD;
        }
        return count;
    }
}
