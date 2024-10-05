package leetcode;

public class PermutationInString {
    public static void main(String[] args) {
        PermutationInString permutationInString = new PermutationInString();
        System.out.println(permutationInString.checkInclusionOptimized("hello", "ooolleoooleh"));
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


    public boolean checkInclusionOptimized(String s1, String s2) {
        int[] first = new int[26];
        int[] second = new int[26];
        for (char ch : s1.toCharArray()) {
            first[ch - 'a']++;
        }
        int window = s1.length() - 1;
        for (int i = 0; i < s2.length(); i++) {
            second[s2.charAt(i) - 'a']++;
            if(i>=window){
                if(comparer(first,second)) return true;
                second[s2.charAt(i-window)-'a']--;
            }
        }

        return false;
    }

    private boolean comparer(int[] first, int[] second) {
        for (int i = 0; i < 26; i++) {
            if(first[i]!=second[i]) return false;
        }
        return true;
    }
}
