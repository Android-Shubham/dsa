package algomap.io.ArryasAndStrings;

//https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/description/?envType=daily-question&envId=2024-12-02
public class PrefixOfAnyWord {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] strs = sentence.split(" ");
        for(int i=0;i<strs.length;i++){
            if(isPre(strs[i],searchWord)){
                return i+1;
            }
        }

        return -1;
    }
    private boolean isPre(String full,String search){
        if(full.length()<search.length()){
            return false;
        }
        int i=0;
        while(i<search.length()){
            if(full.charAt(i)!=search.charAt(i)){
                return false;
            }
            i++;
        }
        return i==search.length();
    }
}
