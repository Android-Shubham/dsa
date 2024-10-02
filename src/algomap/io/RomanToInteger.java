package algomap.io;

//https://leetcode.com/problems/roman-to-integer/description/
public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInteger("MCMXCIV"));
    }

    private int romanToInteger(String s){
        int res = 0;
        int prev = 0;
        for (int i=s.length()-1;i>=0;i--) {
            int currentValue = getCurrentValue(s.charAt(i));
            if(currentValue<prev){
                res -= currentValue;
            }else {
                res += currentValue;
            }
            prev = currentValue;
        }

        return res;
    }

    private int getCurrentValue(char c) {
        return switch (c){
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
