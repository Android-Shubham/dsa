package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TheKthLexicographicalString {
    ArrayList<String> happy = new ArrayList<>();
    Set<String> set = new HashSet<>();
    public String getHappyString(int n, int k) {
        generateHappyStrings(n,"abc",new StringBuilder(),'d');
        if(happy.size()<k){
            return "";
        }
        return happy.get(k-1);
    }

    private void generateHappyStrings(int n,String str,StringBuilder cur,char last){
        if(cur.length()>n){
            return;
        }
        if(cur.length()==n){
            if(!set.contains(cur.toString())){
                happy.add(cur.toString());
            }
            return;
        }
        for(int i=0;i<3;i++){
            char current = str.charAt(i);
            if(last!=current){
                cur.append(current);
                generateHappyStrings(n,str,cur,current);
                cur.deleteCharAt(cur.length()-1);
            }
        }
    }
}
