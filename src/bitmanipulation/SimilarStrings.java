package bitmanipulation;

public class SimilarStrings {
    public static void main(String[] args) {
        similarPairs(new String[]{"aba","aabb","abcd","bac","aabc"});
    }


    public static int similarPairs(String[] words) {
        int count = 0;
        int[] masks = new int[words.length];

        // Generate the unique number corresponding to each word in the list.
        for (int i = 0; i < words.length; i++) {
            masks[i] = getMask(words[i]);
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (masks[i] == masks[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int getMask(String word)
    {
        int mask = 0;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // Here we generate a binary number from the unique characters in the string.
            // First create a binary number with all zeroes.
            // Set the binary 1 in the index position of the character.
            // for character 'a', we set the last bit of the binary number to 1.
            // for character 'b' we set the second last bit of the binary number to 1.
            // Steps used here are:
            // Get 0-based index of char.
            // Left shift the 1 by that index.
            // We use OR to replace the current zero in the binary number with 1.
            // Finally we get a unique number based on the unique characters present in the string.
           mask = mask | (1 << (ch - 'a'));
        }
        return mask;
    }
}
