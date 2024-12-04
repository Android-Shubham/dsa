package algomap.io.ArryasAndStrings;

public class MakeStringASubSequence {
    public boolean canMakeSubsequence(String str1, String str2) {
        int i=0;
        int j=0;
        while(i<str1.length() && j<str2.length()){
            char s1 = str1.charAt(i);
            char s2 = str2.charAt(j);
            if(s1==s2){
                i++;
                j++;
            }else if(getNext(s1) == s2){
                i++;
                j++;
            }else{
                i++;
            }
        }
        return j==str2.length();
    }

    private char getNext(char ch){
        if(ch=='z'){
            return 'a';
        }else{
            return (char)(ch+1);
        }
    }
}
