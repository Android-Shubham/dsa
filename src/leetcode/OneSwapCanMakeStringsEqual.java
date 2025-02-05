package leetcode;

public class OneSwapCanMakeStringsEqual {
    public boolean areAlmostEqual(String s1, String s2) {
        int i=0;
        int n = s1.length();
        int count = 0;
        char s1_first='a';
        char s2_first='a';
        char s2_second='a';
        char s1_second='a';
        while(i<n){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(count==0){
                    s1_first = s1.charAt(i);
                    s2_first = s2.charAt(i);
                }else if(count==1){
                    s1_second = s1.charAt(i);
                    s2_second = s2.charAt(i);
                }else{
                    return false;
                }
                count++;
            }
            i++;
        }
        return (s1_first == s2_second && s1_second == s2_first);
    }
}
