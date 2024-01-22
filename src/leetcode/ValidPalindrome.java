package leetcode;

public class ValidPalindrome {


    public static void main(String[] args) {
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        String str = getCleanString(s);
        if(str.length()==0){
            return true;
        }
        return ifPalindrome(str.toLowerCase());
    }

    public static boolean ifPalindrome(String str){
        int length = str.length();
        for(int i=0 ; i<length/2; i++){
            if(str.charAt(i)!=str.charAt(length-1-i)){
                return false;
            }
        }


        return true;
    }

    public static String getCleanString(String str){
        StringBuilder cleanString = new StringBuilder();

        for(int i=0 ; i<str.length(); i++){
            Character currentChar = str.charAt(i);
            if((currentChar>='a' && currentChar<= 'z') ||  (currentChar>='A' && currentChar<= 'Z')
                    || (currentChar>='0' && currentChar<='9')){
                cleanString.append(currentChar);
            }
        }

        return cleanString.toString();
    }
}

