package leetcode;

public class RepeatedSubstring {

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abcabcabc"));
    }

    public static boolean repeatedSubstringPattern(String s) {

        int len = s.length();
        for(int i = len/2; i>=1; i--){
            if(len%i == 0){
                int repeats = len/i;
                String sub = s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                sb.append(sub.repeat(repeats));

                if(sb.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;


    }


}
