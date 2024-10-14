package algomap.io.HashMapsAndSets;

//https://leetcode.com/problems/valid-anagram/
public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        System.out.println(validAnagram.isAnagram("anagram", "anagrams"));
    }

    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] map = new int[26];
        for(int i=0;i<s.length();i++){
            map[s.charAt(i)-'a']++;
            map[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(map[i]!=0){
                return false;
            }
        }
        return true;
    }
}
