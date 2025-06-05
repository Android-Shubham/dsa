package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SmallestEquivalentString {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        HashMap<Character, List<Character>> adj = new HashMap<>();
        int n = s1.length();
        for (int i = 0; i < n; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if (!adj.containsKey(ch1)) {
                adj.put(ch1, new ArrayList<>());
            }
            if (!adj.containsKey(ch2)) {
                adj.put(ch2, new ArrayList<>());
            }
            adj.get(ch1).add(ch2);
            adj.get(ch2).add(ch1);
        }
        StringBuilder sb = new StringBuilder();
        for (char ch : baseStr.toCharArray()) {
            boolean[] visited = new boolean[26];
            char min = dfs(adj, ch, visited);
            sb.append(min);
        }
        return sb.toString();
    }

    private char dfs(HashMap<Character, List<Character>> adj, char cur, boolean[] visited) {
        visited[cur - 'a'] = true;
        char min = cur;
        for (char next : adj.getOrDefault(cur, new ArrayList<>())) {
            if (!visited[next - 'a']) {
                char potential = dfs(adj, next, visited);
                if (potential < min) {
                    min = potential;
                }
            }
        }
        return min;
    }
}
