package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LexicalOrder {
    public static void main(String[] args) {
        LexicalOrder lexicalOrder = new LexicalOrder();
        System.out.println(lexicalOrder.lexicalOrder(132));
    }
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            dfs(i, n, result);
        }
        return result;
    }

    private void dfs(int current, int n, List<Integer> result) {
        if (current > n) return;
        result.add(current);
        for (int i = 0; i <= 9; i++) {
            int next = current * 10 + i;
            if (next > n) return;
            dfs(next, n, result);
        }
    }
}
