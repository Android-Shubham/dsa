package leetcode;

public class NumOfSubsContainingAllThree {
    public static void main(String[] args) {
        NumOfSubsContainingAllThree numOfSubsContainingAllThree = new NumOfSubsContainingAllThree();
        System.out.println(numOfSubsContainingAllThree.numberOfSubstrings("abcabc"));
        System.out.println(numOfSubsContainingAllThree.numberOfSubstrings("aaabc"));
        System.out.println(numOfSubsContainingAllThree.numberOfSubstrings("abc"));
    }

    public int numberOfSubstrings(String s) {
        int n = s.length();
        int i = 0;
        int ans = 0;
        int[] freq = new int[3];
        for(int j=0;j<n;j++){
            freq[s.charAt(j)-'a']++;
            while(containsAll(freq)){
                ans+=(n-j);
                freq[s.charAt(i)-'a']--;
                i++;
            }
        }
        return ans;
    }

    private boolean containsAll(int[] freq) {
        for (int i = 0; i < 3; i++) {
            if (freq[i] < 1) {
                return false;
            }
        }
        return true;
    }
}
