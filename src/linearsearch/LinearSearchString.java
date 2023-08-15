package linearsearch;

public class LinearSearchString {
    public static void main(String[] args) {
        String str = "shubham";
        int pos = linearSearchString(str, 'x');
        System.out.println(pos);
    }

    private static int linearSearchString(String str, char target) {
        if (str.length() == 0) {
            return -1;
        }

        for (int index = 0; index < str.length(); index++) {
            char pointer = str.charAt(index);
            if (pointer == target) {
                return index;
            }
        }

        return -1;
    }
}
