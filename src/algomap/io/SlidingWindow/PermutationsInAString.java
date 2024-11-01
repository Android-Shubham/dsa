package algomap.io.SlidingWindow;

public class PermutationsInAString {

    public boolean checkInclusion(String s1, String s2) {
        int window = s1.length()-1;
        int[] map = new int[26];
        for (char ch : s1.toCharArray()) {
            map[ch - 'a']++;
        }
        int[] map2 = new int[26];
        for(int i=0;i<s2.length();i++){
            map2[s2.charAt(i)-'a']++;
            if(i>=window){
                if(matcher(map,map2)){
                    return true;
                }
                map2[s2.charAt(i-window)-'a']--;
            }
        }
        return false;
    }

    private boolean matcher(int[] map1,int[] map2){
        for(int i=0;i<26;i++){
            if(map1[i]!=map2[i]){
                return false;
            }
        }
        return true;
    }
}
