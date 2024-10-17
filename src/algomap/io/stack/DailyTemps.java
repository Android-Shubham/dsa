package algomap.io.stack;

import java.util.Stack;

public class DailyTemps {

    public static void main(String[] args) {
        DailyTemps dailyTemps = new DailyTemps();
        dailyTemps.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});
    }
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stk = new Stack<>();
        int[] ans = new int[n];
        // int i = 0;
        // int j = 0;

        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && temperatures[stk.peek()] < temperatures[i]){
                ans[stk.peek()] = i - stk.peek();
                stk.pop();
            }
            stk.push(i);
        }

        return ans;
    }
}
