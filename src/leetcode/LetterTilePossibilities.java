package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LetterTilePossibilities {
    Set<String> set = new HashSet<>();

    public int numTilePossibilities(String tiles) {
        boolean[] used = new boolean[tiles.length()];
        backtrack(tiles, used, new StringBuilder());
        return set.size();
    }

    private void backtrack(String tiles, boolean[] used, StringBuilder cur) {
        if (!cur.isEmpty()) {
            set.add(cur.toString());
        }
        for (int i = 0; i < tiles.length(); i++) {
            if (!used[i]) {
                used[i] = true;
                cur.append(tiles.charAt(i));
                backtrack(tiles, used, cur);
                cur.deleteCharAt(cur.length() - 1);
                used[i] = false;
            }
        }
    }
}
