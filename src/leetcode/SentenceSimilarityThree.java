package leetcode;

public class SentenceSimilarityThree {
    public static void main(String[] args) {
        SentenceSimilarityThree sentenceSimilarityThree = new SentenceSimilarityThree();
        System.out.println(sentenceSimilarityThree.areSentencesSimilar("Hello Jane","Hello my name is Jane"));
    }
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        int start = 0;
        String[] s1 = sentence1.split(" ");
        String[] s2 = sentence2.split(" ");
        int s1Length = s1.length;
        int s2Length = s2.length;
        int end1 = s1.length-1;
        int end2 = s2.length-1;
        if(s1Length>s2Length){
           return areSentencesSimilar(sentence2,sentence1);
        }
        while (start<s1Length && s1[start].equals(s2[start])){
            start++;
        }
        while (end1>=0 && s1[end1].equals(s2[end2])){
            end2--;
            end1--;
        }
        return end1<start;
    }
}
