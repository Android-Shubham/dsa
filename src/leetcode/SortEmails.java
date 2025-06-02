package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortEmails {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        HashMap<String,List<String>> map = new HashMap<>();
        Set<String> emails = new HashSet<>();
        for(List<String> account : accounts){
            String name = account.get(0);
            String mail = account.get(1);
            if(emails.contains(mail)){
                continue;
            }
            if(!map.containsKey(name)){
                map.put(name,new ArrayList<>());
            }
            map.get(name).add(mail);
            emails.add(mail);
        }
        List<List<String>> res = new ArrayList<>();

        for(Map.Entry<String,List<String>> entry : map.entrySet()){
            List<String> temp = new ArrayList<>();
            temp.add(entry.getKey());
            temp.addAll(entry.getValue());
            res.add(temp);
        }
        return res;
    }
}
