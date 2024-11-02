package algomap.io.SlidingWindow;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement longestRepeatingCharacterReplacement = new LongestRepeatingCharacterReplacement();
        System.out.println(longestRepeatingCharacterReplacement.characterReplacement("AABABBA", 1));
        System.out.println(longestRepeatingCharacterReplacement.characterReplacement("ABAB", 2));

    }

    public int characterReplacement(String s, int k) {
        int window = 0;
        int n = s.length();
        for(char c = 'A'; c<='Z'; c++){
            int i=0;
            int j=0;
            int replacement = 0;
            while(j<n){
                if(s.charAt(j)==c){
                    j++;
                }else if(replacement<k){
                    j++;
                    replacement++;
                }else if (s.charAt(i)==c){
                    i++;
                }else {
                    i++;
                    replacement--;
                }

                window = Math.max(window, j-i);
            }
        }
        return window;
    }

}
