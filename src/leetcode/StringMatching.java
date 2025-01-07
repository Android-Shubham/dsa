package leetcode;

import java.util.ArrayList;
import java.util.List;

public class StringMatching {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(isSub(words,i)){
                ans.add(words[i]);
            }
        }
        return ans;
    }

    private boolean isSub(String[] words,int i){
        String cur = words[i];
        for(int j=0;j<words.length;j++){
            if(i!=j && words[j].contains(cur)){
                return true;
            }
        }

        return false;
    }
}
