package algomap.io.backtracking;

import java.util.ArrayList;
import java.util.List;

public class BinaryStringWithoutConsecutive0 {
    List<String> res = new ArrayList<>();

    public static void main(String[] args) {
        BinaryStringWithoutConsecutive0 binaryStringWithoutConsecutive0 = new BinaryStringWithoutConsecutive0();
        System.out.println(binaryStringWithoutConsecutive0.validStrings(3));
    }

    public List<String> validStrings(int n) {
        backtrack("", n);
        return res;
    }

    private void backtrack(String cur, int n) {
        if (cur.length() == n) {
            res.add(cur);
            return;
        }
        if (cur.isEmpty() || cur.charAt(cur.length() - 1) != '0') {
            backtrack(cur+"0", n);
        }
        backtrack(cur+"1", n);
    }
}
