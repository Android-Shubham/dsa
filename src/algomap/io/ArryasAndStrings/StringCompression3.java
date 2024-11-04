package algomap.io.ArryasAndStrings;

public class StringCompression3 {
    public String compressedString_mySolution(String word) {
        StringBuilder sb = new StringBuilder();
        char prev = word.charAt(0);
        int count = 0;
        for (char ch : word.toCharArray()) {
            if (prev == ch) {
                count++;
                if (count > 9) {
                    sb.append(9).append(ch);
                    count = 1;
                }
            } else {
                sb.append(count).append(prev);
                count = 1;
            }
            prev = ch;
        }
        sb.append(count).append(prev);
        return sb.toString();
    }

    public String compressedString(String word) {
        if (word.isEmpty()) {
            return "";
        }
        int n = word.length();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int j = i;
            char cur = word.charAt(i);
            while (j < n && word.charAt(j) == cur) {
                count++;
                j++;
            }
            while (count > 9) {
                sb.append(9).append(cur);
                count -= 9;
            }
            sb.append(count).append(cur);
            count = 0;
            i = j - 1;
        }
        return sb.toString();
    }
}
