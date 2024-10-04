package algomap.io;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class BestTimeToBuySell {
    public static void main(String[] args) {
        BestTimeToBuySell bestTimeToBuySell = new BestTimeToBuySell();
        System.out.println(bestTimeToBuySell.maxProfit(new int[]{7,1,5,3,6,4}));
    }
    private int maxProfit(int[] prices){
        int buy = Integer.MAX_VALUE;
        int sell = 0;
        for(int price : prices){
            buy = Math.min(buy,price);
            sell =Math.max(sell,price-buy);
        }
        return sell;
    }
}
