package leetcode;

import java.util.Arrays;

public class PlusOne {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
    }

    public static int[] plusOne(int[] digits) {
        int originalNum = 0;
        int length = digits.length;
        if(digits[length - 1] == 9){
            length+=1;
        }
        int[] result = new int[length];

        for(int i=0;i<digits.length;i++){
            if(i==digits.length-1){
                if(digits[i] == 9){
                    result[i] = 1;
                    result[i+1] = 0;
                }else{
                    result[i] = digits[i]+=1;
                }
            }else{
                result[i] = digits[i];
            }
        }

        return result;
    }
}
