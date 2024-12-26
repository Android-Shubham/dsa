package algomap.io.dp;

import java.util.Arrays;

public class FibonacciSequence {
    public static void main(String[] args) {
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        System.out.println(fibonacciSequence.fib_top_down(7));
        System.out.println(fibonacciSequence.fiboRecursion(7));

    }
    //top down DP
    public int fiboRecursion(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return fiboRecursion(n-1) + fiboRecursion(n-2);
    }

    public int fib_top_down(int n) {
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        return recur(memo,n);
    }

    private int recur(int[] memo, int n) {
        if(n<=1){
            memo[n] = n;
            return n;
        }
        if(memo[n]!=-1) return memo[n];
        memo[n] = recur(memo, n-1) + recur(memo, n-2);
        return memo[n];
    }
}
