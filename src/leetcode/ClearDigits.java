package leetcode;

public class ClearDigits {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++){
            char cur = s.charAt(i);
            if(cur>='0' && cur<='9'){
                if(!sb.isEmpty()){
                    sb.deleteCharAt(sb.length()-1);
                }
            }else{
                sb.append(cur);
            }
        }
        return sb.toString();
    }
}
