package leetcode;

public class IsPowerOfThree {

    public static void main(String[] args) {
        //System.out.println(isPowerOfThree(27));
        System.out.println(isPowerOfTwo(3));
//        System.out.println(isPowerOfTwo(16));
//        System.out.println(isPowerOfTwo(1));
//        System.out.println(isPowerOfTwo(8));


    }

    public static boolean isPowerOfTwo(int n) {
        if(n==1) {
            return true;
        }
        if(n%2!=0 || n==0){
            return false;
        }
        String str = String.valueOf(n);
        return isPowerOfTwo(n/2);
    }


    public static boolean isPowerOfThree(int n) {
        if(n==1) {
            return true;
        }
        if(n%3!=0 || n==0){
            return false;
        }
        return isPowerOfThree(n/3);
    }
}
