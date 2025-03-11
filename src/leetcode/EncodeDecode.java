package leetcode;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecode {
    public String encode(List<String> strs) {
        int n = strs.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(strs.get(i).length()).append(":").append(strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int delimiter = str.indexOf(":", i);
            int length = Integer.parseInt(str.substring(i, delimiter));
            String temp = str.substring(delimiter + 1, delimiter + 1 + length);
            i = delimiter + 1 + length;
            res.add(temp);
        }
        return res;
    }
}
