package leetcode;

public class SmallestNumberFromDi {


    public static void main(String[] args) {
        SmallestNumberFromDi smallestNumberFromDi = new SmallestNumberFromDi();
        System.out.println(smallestNumberFromDi.smallestNumber("IIIDIDDD"));
    }
    public String smallestNumber(String pattern) {
        StringBuilder sb = new StringBuilder();
        buildString(0,0,pattern.toCharArray(),sb);
        return sb.reverse().toString();
    }
    private int buildString(int index,int value,char[] pattern,StringBuilder sb){
        if(index !=pattern.length){
            if(pattern[index]=='I'){
                buildString(index+1,index+1,pattern,sb);
            }else{
                value = buildString(index+1,value,pattern,sb);
            }
        }
        sb.append(value+1);
        return value+1;
    }
}
