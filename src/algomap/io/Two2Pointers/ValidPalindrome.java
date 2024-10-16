package algomap.io.Two2Pointers;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i<j){
            char first = s.charAt(i);
            char second = s.charAt(j);
            if((first<'a' || first>'z') && (first<'A' || first>'Z') && (first <'0' || first>'9')){
                i++;
                continue;
            }

            if((second<'a' || second>'z') && (second<'A' || second>'Z') && (second <'0' || second>'9')){
                j--;
                continue;
            }
            if(!String.valueOf(first).equalsIgnoreCase(String.valueOf(second))){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}
