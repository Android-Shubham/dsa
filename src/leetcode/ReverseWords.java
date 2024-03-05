package leetcode;

public class ReverseWords {
    public static void main(String[] args) {
        System.out.println(reverseWords("This     is a string"));
    }

    public static String reverseWords(String s) {
        String[] words = s.trim().split(" ");
        StringBuilder sb  = new StringBuilder();
        for (int i = words.length-1; i >= 0; i--) {
            if(!words[i].isEmpty()) {
                sb.append(words[i]);
                sb.append(" ");
            }
        }

        return sb.toString().trim();
    }
}
