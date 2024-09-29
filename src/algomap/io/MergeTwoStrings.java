package algomap.io;

//https://leetcode.com/problems/merge-strings-alternately/submissions/1234785302/
public class MergeTwoStrings {
    public static void main(String[] args) {
        System.out.println(mergeTwoStringAlternatively("abcd","pqrs"));
    }

    private static String mergeTwoStringAlternatively(String word1, String word2) {

        StringBuilder sb = new StringBuilder();
        int i=0;
        int j=0;
        while (i<word1.length() && j<word2.length()){
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        while (i<word1.length()){
            sb.append(word1.charAt(i++));
        }
        while(j<word2.length()){
            sb.append(word2.charAt(j++));
        }
        return sb.toString();
    }
}
