package algomap.io.binarysearch;

public class KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {
        int end = Integer.MIN_VALUE;
        int start = 1;
        for(int pile : piles){
            end = Math.max(end,pile);
        }
        while(start<end){
            int mid = start + (end - start) / 2;
            if(canEat(piles,mid,h)){
                end = mid;
            }else{
                start = mid + 1;
            }
        }
        return start;
    }

    private boolean canEat(int[] piles, int k,int h) {
        int max = 0;
        for(int pile : piles){
            max +=(pile/k);
            if(pile%k>0){
                max+=1;
            }
        }
        return max <= h;
    }
}
