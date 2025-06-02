package leetcode;

import java.util.Arrays;

public class Candies {
    public int distributeCandies(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);
        for (int i = 1; i < n; i++) {
            if (ratings[i - 1] < ratings[i]) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i + 1] < ratings[i] && candies[i + 1] >= candies[i]) {
                candies[i] = candies[i + 1] + 1;
            }
        }
        int ans = 0;
        for (int candy : candies) {
            ans += candy;
        }
        return ans;
    }
}
