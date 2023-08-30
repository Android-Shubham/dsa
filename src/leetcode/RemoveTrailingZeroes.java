package leetcode;

public class RemoveTrailingZeroes {

    public static void main(String[] args) {
        System.out.println(removeTrailingZeros("12300000000"));
    }

    public static String removeTrailingZeros(String num) {

        int len = num.length();
        while(len>0){
            if(num.charAt(len-1)=='0'){
                num = num.substring(0,len-1);
                len--;
            }else{
                break;
            }
        }


        return num;
    }
}
