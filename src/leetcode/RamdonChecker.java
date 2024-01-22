package leetcode;

public class RamdonChecker {
    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
/**
 * ["RandomizedSet","insert","insert","remove","insert","remove","getRandom"]
 * [[],[0],[1],[0],[2],[1],[]]
 */
        boolean res2 = randomizedSet.insert(0);
        boolean res5 = randomizedSet.insert(1);

        boolean res3 =randomizedSet.remove(0);
        boolean res4 = randomizedSet.insert(2);
        boolean res1 = randomizedSet.remove(1);

        int val1 =randomizedSet.getRandom();
//        boolean res = randomizedSet.insert(2);
//        int value = randomizedSet.getRandom();
        int i = 0;
    }
}
