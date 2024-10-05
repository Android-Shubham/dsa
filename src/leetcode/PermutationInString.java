package leetcode;

public class PermutationInString {
    public static void main(String[] args) {
        PermutationInString permutationInString = new PermutationInString();
        permutationInString.checkInclusion("adc","dcda");
    }

    //brute force
    public boolean checkInclusion(String s1, String s2) {
        int[] map = new int[26];
        for (char ch : s1.toCharArray()) {
            map[ch - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            char cur = s2.charAt(i);
            if (map[cur - 'a'] != 0) {
                int[] temp = map.clone();
                int k = i;
                while (k < s2.length() && temp[s2.charAt(k) - 'a'] != 0) {
                    cur = s2.charAt(k);
                    temp[cur - 'a']--;
                    ++k;
                }
                boolean found = false;
                for (int j = 0; j < 26; j++) {
                    if (temp[j] > 0) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    return true;
                }
            }
        }

        return false;
    }
}
