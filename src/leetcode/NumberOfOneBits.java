package leetcode;

public class NumberOfOneBits {

    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }

    public static int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}
