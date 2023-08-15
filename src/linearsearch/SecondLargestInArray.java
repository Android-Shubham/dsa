package linearsearch;

public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] arr = {201, 200, 11, 100, 1, 2, 3, 4, 5, 6, 7, 8, 10, 301, 301, 301, 201};
        int min = seconLargest(arr);
        System.out.println(min);
    }

    private static int seconLargest(int[] arr) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = i;
            } else if (i > secondLargest && i != firstLargest) {
                secondLargest = i;
            }
        }
        return secondLargest;
    }
}
