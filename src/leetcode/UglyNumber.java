package leetcode;

public class UglyNumber {
    public static void main(String[] args) {
       // isUglyNumber(0);
        nthUglyNumber(10);
    }
    private static boolean isUglyNumber(int num){
        num = divideBy(num,2);
        num = divideBy(num,3);
        num = divideBy(num,5);
        return num==1;
    }

    private static int divideBy(int num, int i) {
        while (num%i==0){
            num/=i;
        }
        return num;
    }

    public static int nthUglyNumber(int n) {
        int[] uglyNums = new int[n];
        uglyNums[0] = 1;
        int twos = 0;
        int threes = 0;
        int fives = 0;

        for (int i = 1; i < n; i++) {
            uglyNums[i] = Math.min(uglyNums[twos] * 2, Math.min(uglyNums[threes] * 3, uglyNums[fives] * 5));
            if (uglyNums[i] == uglyNums[twos] * 2) {
                twos++;
            }
            if (uglyNums[i] == uglyNums[threes] * 3) {
                threes++;
            }
            if (uglyNums[i] == uglyNums[fives] * 5) {
                fives++;
            }
        }
        return uglyNums[n - 1];
    }
}
