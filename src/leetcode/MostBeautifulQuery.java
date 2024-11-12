package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class MostBeautifulQuery {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        int[] ans = new int[queries.length];
        Arrays.sort(items, Comparator.comparingInt(a -> a[0]));
        int prevMax = items[0][1];
        for(int i=0;i<items.length;i++){
            items[i][1] = Math.max(prevMax,items[i][1]);
            prevMax = items[i][1];
        }
        int index = 0;
        for(int query : queries){
            ans[index++] = binarySearch(items,query);
        }
        return ans;
    }

    private int binarySearch(int[][] items,int targetPrice){
        int l = 0;
        int r = items.length - 1;
        int ans = 0;
        while(l<=r){
            int m = l+(r - l) / 2;
            if(items[m][0]>targetPrice){
                r = m - 1;
            }else{
                ans = Math.max(ans,items[m][1]);
                l = m + 1;
            }
        }
        return ans;
    }
}
