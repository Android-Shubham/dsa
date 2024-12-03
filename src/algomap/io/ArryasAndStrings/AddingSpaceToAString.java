package algomap.io.ArryasAndStrings;

public class AddingSpaceToAString {
    public String addSpaces(String s, int[] spaces) {
        int i=0;
        int j=0;
        StringBuilder sb = new StringBuilder();
        while(i<s.length() && j<spaces.length){
            if(i==spaces[j]){
                sb.append(" ");
                j++;
            }
            sb.append(s.charAt(i++));
        }
        while(i<s.length()){
            sb.append(s.charAt(i++));
        }
        return sb.toString();
    }
}
