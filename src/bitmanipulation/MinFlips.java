package bitmanipulation;

public class MinFlips {
    public static void main(String[] args) {
        minFlips(2,6,5);
    }
    public static int minFlips(int a, int b, int c) {
        int count = 0;
        while (a > 0 || b > 0 || c > 0) {
            if ((c&1) == 1) {
                if((a&1) == 0 && (b&1) == 0){
                    count++;
                }
            } else {
                if((a&1) == 1) count++;
                if((b&1) == 1) count++;
            }
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        return count;
    }
}
