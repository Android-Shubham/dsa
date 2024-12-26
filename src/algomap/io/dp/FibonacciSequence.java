package algomap.io.dp;

public class FibonacciSequence {
    public static void main(String[] args) {
        FibonacciSequence fibonacciSequence = new FibonacciSequence();
        System.out.println(fibonacciSequence.fib_bottom_up(7));
        System.out.println(fibonacciSequence.fib_top_down(7));

    }
    //top down DP
    public int fib_top_down(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        return fib_top_down(n-1) + fib_top_down(n-2);
    }

    public int fib_bottom_up(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int first = 0;
        int second = 1;
        int i = 1;
        int temp = 0;
        while (i != n) {
            temp = first + second;
            first = second;
            second = temp;
            i++;
        }
        return temp;
    }
}
