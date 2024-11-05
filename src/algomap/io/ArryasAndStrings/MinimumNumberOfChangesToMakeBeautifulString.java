package algomap.io.ArryasAndStrings;

//https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/description
public class MinimumNumberOfChangesToMakeBeautifulString {

    public int minChanges_mySolution(String s) {
        int changes = 0;
        for (int i = 0; i < s.length(); i += 2) {
            int zeroes = 0;
            int ones = 0;
            for (int j = i; j < i + 2; j++) {
                if (s.charAt(j) == '0') {
                    zeroes++;
                } else {
                    ones++;
                }
                changes+=Math.min(zeroes,ones);
            }
        }
        return changes;
    }

    public int minChanges(String s) {
        int changes = 0;
        for (int i = 1; i < s.length(); i += 2) {
            if(s.charAt(i-1)!=s.charAt(i)){
                changes++;
            }
        }
        return changes;
    }
}
