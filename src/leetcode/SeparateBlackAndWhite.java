package leetcode;
//https://leetcode.com/problems/separate-black-and-white-balls
public class SeparateBlackAndWhite {

    public static void main(String[] args) {
        SeparateBlackAndWhite separateBlackAndWhite = new SeparateBlackAndWhite();
        System.out.println(separateBlackAndWhite.minimumSteps("101"));
    }

    public long minimumSteps(String s) {
        int black = 0;
        long steps = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if(s.charAt(i)=='0'){
                steps += (i-black);
                black++;
            }
        }
        return steps;
    }
}
