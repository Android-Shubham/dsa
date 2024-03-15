package leetcode;

public class CustomSortString {
    public static void main(String[] args) {
        System.out.println(customSortString("kqep","pekeq"));
    }
    public static String customSortString(String order, String s) {
        StringBuilder ans = new StringBuilder();
        int[] count = new int[128];
        for(char c : s.toCharArray()){
            ++count[c];
        }
        for(char c : order.toCharArray()){
            while(count[c]-- > 0){
                ans.append(c);
            }
        }
        for(char c = 'a'; c <= 'z' ; c++){
            while(count[c]-- > 0){
                ans.append(c);
            }
        }

        return ans.toString();
    }
}
