import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Backtracking {

    static List<List<Integer>> res = new ArrayList<>();
    static ArrayList<Integer> cur = new ArrayList<>();

    public static void main(String[] args) {
        combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8);
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        findCombination( candidates, target, 0);
        return res;
    }

    private static void findCombination(
                                        int[] candidates,
                                        int target,
                                        int index) {
        if (target == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (i != index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            if (candidates[i] > target) {
                return;
            }
            cur.add(candidates[i]);
            findCombination(candidates,target-candidates[i],i+1);
            cur.remove(cur.size()-1);
        }

    }
}
