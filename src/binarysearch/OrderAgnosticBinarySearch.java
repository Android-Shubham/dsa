package binarysearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int pos = orderAgnosticBinarySearch(arr, 1);
        int pos2 = orderAgnosticBinarySearch(arr2, 1);

        System.out.println(pos);
        System.out.println(pos2);

    }

    private static int orderAgnosticBinarySearch(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }


        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = (start + (end-start)/2);
            if (arr[mid] == target) {
                return mid;
            } else if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}