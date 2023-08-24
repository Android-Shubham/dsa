package leetcode;

public class PalindomeNumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(122));
        System.out.println(isPalindrome(122221));
        System.out.println(isPalindrome(321));
        System.out.println(isPalindrome(794565421));

    }

    public static boolean isPalindrome(int x) {
        int reverseNumber = reverseTheNumber(x);
        return reverseNumber == x;
    }


   static int reverseTheNumber(int n) {
        int temp=0;
        while (n>0){
            temp = temp*10 + n%10;
            n = n/10;
        }

        return temp;
    }
}
