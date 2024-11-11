package algomap.io.backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class LetterCombination {

    List<String> res = new ArrayList<>();
    HashMap<Character,String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()) return res;
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        backtrack(new StringBuilder(),0,digits);
        return res;
    }

    private void backtrack(StringBuilder cur,int index,String digits){
        if(index == digits.length()){
            res.add(cur.toString());
            return;
        }
        String letters = map.get(digits.charAt(index));
        for(char ch : letters.toCharArray()){
            cur.append(ch);
            backtrack(cur,index+1,digits);
            cur.deleteCharAt(cur.length()-1);
        }
    }
}
