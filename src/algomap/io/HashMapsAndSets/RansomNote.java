package algomap.io.HashMapsAndSets;

//https://leetcode.com/problems/ransom-note/
public class RansomNote {
    public static void main(String[] args) {
        RansomNote ransomNote = new RansomNote();
        System.out.println(ransomNote.canConstruct("a", "b"));
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] ransom = new int[26];
        int[] magzine = new int[26];
        for(char ch : ransomNote.toCharArray()){
            ransom[ch - 'a']++;
        }

        for(char ch : magazine.toCharArray()){
            magzine[ch - 'a']++;
        }

        for(char ch : ransomNote.toCharArray()){
            if(ransom[ch-'a'] > magzine[ch-'a']){
                return false;
            }
        }
        return true;

    }
}
