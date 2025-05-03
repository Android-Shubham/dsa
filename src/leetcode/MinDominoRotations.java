package leetcode;

public class MinDominoRotations {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int n = tops.length;
        int swaps = Integer.MAX_VALUE;
        for(int i=1;i<=6;i++){
            int min = countMin(i,tops,bottoms,n);
            swaps = Math.min(swaps,min);
        }
        return swaps==Integer.MAX_VALUE?-1:swaps;
    }
    private int countMin(int candidate,int[] tops,int[] bottoms,int n){
        int swapTop = 0;
        int swapBottom = 0;
        for(int i=0;i<n;i++){
            if(tops[i]!=candidate){
                if(bottoms[i]!=candidate){
                    swapTop = Integer.MAX_VALUE;
                    break;
                }
                swapTop++;
            }
        }
        for(int i=0;i<n;i++){
            if(bottoms[i]!=candidate){
                if(tops[i]!=candidate){
                    swapBottom = Integer.MAX_VALUE;
                    break;
                }
                swapBottom++;
            }
        }
        return Math.min(swapTop,swapBottom);
    }
}
