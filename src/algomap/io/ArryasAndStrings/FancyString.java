package algomap.io.ArryasAndStrings;

//https://leetcode.com/problems/delete-characters-to-make-fancy-string/?envType=daily-question&envId=2024-11-01
public class FancyString {


    public String makeFancyString_better(String s) {
        int n = s.length();
        int same = 0;
        char prev = s.charAt(0);
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (ch == prev) {
                same++;
            } else {
                same = 1;
            }
            if (same < 3)
                sb.append(ch);
            prev = ch;
        }
        return sb.toString();
    }
    public String makeFancyString_mySolution(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            if(i!=0 && i!=n-1){
                if(arr[i-1] == arr[i] && arr[i+1]==arr[i]){
                    continue;
                }
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
